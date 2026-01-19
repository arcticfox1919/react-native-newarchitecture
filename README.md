# React Native New Architecture Demo

This repository demonstrates the usage of the **New Architecture** in React Native 0.83+, featuring:

- **TurboModules**: Efficient, lazily-loaded native modules.
- **Fabric**: The new C++ based rendering system for native components.

## Project Structure

- `react-native-customview`: Demonstrates a Fabric Native Component.
- `react-native-turbo`: Demonstrates a TurboModule with native implementation.
- `react-native-cxx`: Demonstrates a pure C++ TurboModule.

## Prerequisites

- React Native >= 0.83.0
- New Architecture enabled (default in 0.76+)

## Getting Started

1. **Install dependencies**:
   ```bash
   yarn install
   ```

2. **Run iOS**:
   ```bash
   cd react-native-customview/example
   yarn install
   cd ios
   pod install
   cd ..
   yarn ios
   ```

3. **Run Android**:
   ```bash
   cd react-native-customview/example
   yarn install
   yarn android
   ```
