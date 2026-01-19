package com.customview

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.CustomviewViewManagerInterface
import com.facebook.react.viewmanagers.CustomviewViewManagerDelegate

@ReactModule(name = CustomviewViewManager.NAME)
class CustomviewViewManager : SimpleViewManager<CustomviewView>(),
  CustomviewViewManagerInterface<CustomviewView> {
  private val mDelegate: ViewManagerDelegate<CustomviewView>

  init {
    mDelegate = CustomviewViewManagerDelegate(this)
  }

  override fun getDelegate(): ViewManagerDelegate<CustomviewView>? {
    return mDelegate
  }

  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): CustomviewView {
    return CustomviewView(context)
  }

  @ReactProp(name = "color")
  override fun setColor(view: CustomviewView?, color: Int?) {
    view?.setBackgroundColor(color ?: Color.TRANSPARENT)
  }

  companion object {
    const val NAME = "CustomviewView"
  }
}
