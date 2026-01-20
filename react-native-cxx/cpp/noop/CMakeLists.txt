cmake_minimum_required(VERSION 3.13)

set(CMAKE_VERBOSE_MAKEFILE on)
set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

file(GLOB react_codegen_SRCS CONFIGURE_DEPENDS *.cpp)

add_library(react_codegen_CppDemoSpec
  OBJECT
  ${react_codegen_SRCS}
)

target_include_directories(react_codegen_CppDemoSpec PUBLIC .)
target_link_libraries(react_codegen_CppDemoSpec
  fbjni
  jsi
  reactnative
)

target_compile_reactnative_options(react_codegen_CppDemoSpec PRIVATE)
