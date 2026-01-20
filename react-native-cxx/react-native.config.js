/**
 * @type {import('@react-native-community/cli-types').UserDependencyConfig}
 */
module.exports = {
  dependency: {
    platforms: {
      /**
       * @type {import('@react-native-community/cli-types').IOSDependencyParams}
       */
      ios: {},
      /**
       * @type {import('@react-native-community/cli-types').AndroidDependencyParams}
       */
      android: {
        sourceDir: 'cpp',
        libraryName: 'CppDemoSpec',
        cmakeListsPath: 'noop/CMakeLists.txt',
        cxxModuleCMakeListsModuleName: 'react-native-cxx',
        cxxModuleCMakeListsPath: 'CMakeLists.txt',
        cxxModuleHeaderName: 'NativeCppDemoModule',
      },
    },
  },
};
