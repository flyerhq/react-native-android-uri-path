import { NativeModules, Platform } from 'react-native'

const getPath: (uriString: string) => string =
  Platform.OS === 'android' && NativeModules.RNAndroidURIPathModule
    ? NativeModules.RNAndroidURIPathModule.getPath
    : (uriString: string) => uriString

export default getPath
