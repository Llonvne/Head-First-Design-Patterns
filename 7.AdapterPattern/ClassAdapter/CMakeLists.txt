cmake_minimum_required(VERSION 3.22)
project(ClassAdapter)

set(CMAKE_CXX_STANDARD 14)

add_executable(ClassAdapter main.cpp Duck.cpp Duck.h Turkey.cpp Turkey.h)
