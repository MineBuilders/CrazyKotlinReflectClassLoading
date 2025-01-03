package vip.cdms.allayplugin

import org.allaymc.api.plugin.Plugin
import kotlin.reflect.full.findAnnotations

@Suppress("unused")
class KotlinPluginTemplate : Plugin() {
    override fun onLoad() {
        pluginLogger.info("KotlinPluginTemplate loaded!" + KotlinPluginTemplate::class.findAnnotations<Suppress>())
    }
    override fun onEnable() = pluginLogger.info("KotlinPluginTemplate enabled!")
    override fun onDisable() = pluginLogger.info("KotlinPluginTemplate disabled!")
}
