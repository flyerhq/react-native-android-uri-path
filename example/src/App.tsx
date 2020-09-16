import React, { useEffect } from 'react'
import RNAndroidURIPath, { Counter } from 'react-native-android-uri-path'

const App = () => {
  useEffect(() => {
    console.log(RNAndroidURIPath)
  })

  return <Counter />
}

export default App
