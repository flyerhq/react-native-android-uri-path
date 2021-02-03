package chat.flyer.rnandroiduripath

import android.net.Uri
import android.provider.OpenableColumns
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import okio.Okio
import java.io.File
import java.io.FileNotFoundException
import java.io.IOException

class RNAndroidURIPathModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName() = "RNAndroidURIPathModule"

    @ReactMethod(isBlockingSynchronousMethod = true)
    fun getPath(uriString: String): String {
        val uri = Uri.parse(uriString)
        val cursor = reactApplicationContext.contentResolver.query(uri, null, null, null, null)
        cursor ?: return uriString

        val nameIndex = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
        cursor.moveToFirst()
        val name = cursor.getString(nameIndex)
        cursor.close()

        try {
            val file = File.createTempFile("temp", name, reactApplicationContext.cacheDir)
            file.deleteOnExit()
            val stream = reactApplicationContext.contentResolver.openInputStream(uri)
            return if (stream != null) {
                val source = Okio.buffer(Okio.source(stream))
                val sink = Okio.buffer(Okio.sink(file))
                sink.writeAll(source)
                sink.close()
                file.absolutePath
            } else {
                uriString
            }
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }

        return uriString
    }
}
