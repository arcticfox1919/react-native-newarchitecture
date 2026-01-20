cmake_minimum_required(VERSION 3.13)
set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)

set(LIB_NAME react-native-cxx)

file(GLOB SOURCES CONFIGURE_DEPENDS src/*.cpp)

find_library(LOG_LIB log)

add_library(
  ${LIB_NAME}
  SHARED
  ${SOURCES}
)

target_include_directories(${LIB_NAME} PUBLIC src)

target_link_libraries(
  ${LIB_NAME}
  react_codegen_CppDemoSpec
  ${LOG_LIB}
  jsi
  reactnative
)

target_compile_options(
  ${LIB_NAME}
  PRIVATE
  -fexceptions
  -frtti
  -std=c++20
  -Wall
)
