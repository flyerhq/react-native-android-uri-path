# example

## Getting Started

```bash
yarn
```

for iOS:

```bash
npx pod-install
```

To run the app use:

```bash
yarn ios
```

or

```bash
yarn android
```

## Updating project

1. Remove current `example` project
2. Create a project named `example` using [react-native-better-template](https://github.com/demchenkoalex/react-native-better-template)
3. Revert `README.md` so you can see this guide
4. In `tsconfig.json` add

```json
"baseUrl": ".",
"paths": {
  "@flyerhq/react-native-android-uri-path": ["../src"]
},
```

5. Check the difference in `metro.config.js` and combine all
6. Revert `App.tsx`
7. Check the difference in `settings.gradle` and combine all
8. Check the difference in `android/app/build.gradle` and combine all
9. Check the difference in `MainApplication.kt` and combine all
