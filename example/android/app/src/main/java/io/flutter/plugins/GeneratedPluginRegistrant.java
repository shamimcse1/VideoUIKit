package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new io.agora.agora_rtc_ng.AgoraRtcNgPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin agora_rtc_engine, io.agora.agora_rtc_ng.AgoraRtcNgPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.agora.agorartm.AgoraRtmPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin agora_rtm, io.agora.agorartm.AgoraRtmPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.agora.agora_uikit.AgoraUikitPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin agora_uikit, io.agora.agora_uikit.AgoraUikitPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.agora.iris_method_channel.IrisMethodChannelPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin iris_method_channel, com.agora.iris_method_channel.IrisMethodChannelPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.baseflow.permissionhandler.PermissionHandlerPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e);
    }
  }
}
