import { NativeModules, Platform } from 'react-native'

const getPath: (uriString: string) => string =
  Platform.OS === 'android'
    ? NativeModules.RNAndroidURIPath.getPath
    : (uriString: string) => uriString

export default getPath
