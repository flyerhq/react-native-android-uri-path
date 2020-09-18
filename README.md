# React Native Android URI Path

[![npm](https://img.shields.io/npm/v/@flyerhq/react-native-android-uri-path)](https://www.npmjs.com/package/@flyerhq/react-native-android-uri-path)
[![build](https://github.com/flyerhq/react-native-android-uri-path/workflows/build/badge.svg)](https://github.com/flyerhq/react-native-android-uri-path/actions?query=workflow%3Abuild)
[![Maintainability](https://api.codeclimate.com/v1/badges/b439310da19b3d6b3917/maintainability)](https://codeclimate.com/github/flyerhq/react-native-android-uri-path/maintainability)

Get an absolute path to a file retrieved by Android's `Intent.ACTION_GET_CONTENT` that returns a `content://` URI.

## Getting Started

```bash
yarn add @flyerhq/react-native-android-uri-path
```

## Usage

```ts
import getPath from '@flyerhq/react-native-android-uri-path'

const path = getPath(uriString)
```

Other platforms will return `uriString`, so no need to use `Platform`.

## License

[MIT](LICENSE)
