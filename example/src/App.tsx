import getPath from '@flyerhq/react-native-android-uri-path'
import React from 'react'
import { Alert, Button, StyleSheet, View } from 'react-native'
import DocumentPicker from 'react-native-document-picker'

const App = () => {
  const openPicker = async () => {
    try {
      const response = await DocumentPicker.pickSingle({
        type: [DocumentPicker.types.allFiles],
      })
      Alert.alert('Path', getPath(response.uri), [{ text: 'OK' }], {
        cancelable: true,
      })
    } catch {}
  }

  return (
    <View style={styles.constainer}>
      <Button title='Choose a file' onPress={openPicker} />
    </View>
  )
}

const styles = StyleSheet.create({
  constainer: {
    alignItems: 'center',
    flex: 1,
    justifyContent: 'center',
  },
})

export default App
