cmake_minimum_required(VERSION 3.4.1)

# 指定so文件输出目录
set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI})

find_library( log-lib
              log )

include_directories(src/main/jni/include)

#=======================================================================================
add_library( avcodec
             SHARED
             IMPORTED )
set_target_properties( avcodec
                       PROPERTIES IMPORTED_LOCATION
                       ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libavcodec-57.so )

add_library( avdevice
           SHARED
           IMPORTED )
set_target_properties( avdevice
                     PROPERTIES IMPORTED_LOCATION
                   ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libavdevice-57.so )

add_library( avfilter
           SHARED
           IMPORTED )
set_target_properties( avfilter
                     PROPERTIES IMPORTED_LOCATION
                  ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libavfilter-6.so )

add_library( avformat
           SHARED
           IMPORTED )
set_target_properties( avformat
                     PROPERTIES IMPORTED_LOCATION
                  ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libavformat-57.so )

add_library( avutil
           SHARED
           IMPORTED )
set_target_properties( avutil
                     PROPERTIES IMPORTED_LOCATION
                     ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libavutil-55.so )

add_library( swresample
           SHARED
           IMPORTED )
set_target_properties( swresample
                     PROPERTIES IMPORTED_LOCATION
                    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libswresample-2.so )

add_library( swscale
           SHARED
           IMPORTED )
set_target_properties( swscale
                     PROPERTIES IMPORTED_LOCATION
       ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libswscale-4.so )

add_library( yuv
           SHARED
           IMPORTED )
set_target_properties( yuv
                     PROPERTIES IMPORTED_LOCATION
       ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libyuv.so )

#=======================================================================================

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=gnu++11")

add_library( ffmpegtest
             SHARED
             src/main/jni/FFmpegTest.cpp )

target_link_libraries( ffmpegtest yuv avcodec avdevice avfilter avformat avutil swresample swscale android ${log-lib} )