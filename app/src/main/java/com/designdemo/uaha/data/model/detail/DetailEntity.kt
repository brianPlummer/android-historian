package com.designdemo.uaha.data.model.detail

import androidx.annotation.Nullable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "detail_table")
data class DetailEntity(
    @PrimaryKey @ColumnInfo(name = "productKey") val productKey: String,
    @ColumnInfo(name = "DeviceName") @Nullable val DeviceName: String?,
    @ColumnInfo(name = "Brand") @Nullable val Brand: String?,
    @ColumnInfo(name = "technology") @Nullable val technology: String?,
    @ColumnInfo(name = "gprs") @Nullable val gprs: String?,
    @ColumnInfo(name = "edge") @Nullable val edge: String?,
    @ColumnInfo(name = "announced") @Nullable val announced: String?,
    @ColumnInfo(name = "status") @Nullable val status: String?,
    @ColumnInfo(name = "dimensions") @Nullable val dimensions: String?,
    @ColumnInfo(name = "weight") @Nullable val weight: String?,
    @ColumnInfo(name = "sim") @Nullable val sim: String?,
    @ColumnInfo(name = "type") @Nullable val type: String?,
    @ColumnInfo(name = "size") @Nullable val size: String?,
    @ColumnInfo(name = "resolution") @Nullable val resolution: String?,
    @ColumnInfo(name = "card_slot") @Nullable val card_slot: String?,
    @ColumnInfo(name = "phonebook") @Nullable val phonebook: String?,
    @ColumnInfo(name = "call_records") @Nullable val call_records: String?,
    @ColumnInfo(name = "camera_c") @Nullable val camera_c: String?,
    @ColumnInfo(name = "alert_types") @Nullable val alert_types: String?,
    @ColumnInfo(name = "loudspeaker_") @Nullable val loudspeaker_: String?,
    @ColumnInfo(name = "_3_5mm_jack_") @Nullable val _3_5mm_jack_: String?,
    @ColumnInfo(name = "sound_c") @Nullable val sound_c: String?,
    @ColumnInfo(name = "wlan") @Nullable val wlan: String?,
    @ColumnInfo(name = "bluetooth") @Nullable val bluetooth: String?,
    @ColumnInfo(name = "gps") @Nullable val gps: String?,
    @ColumnInfo(name = "infrared_port") @Nullable val infrared_port: String?,
    @ColumnInfo(name = "radio") @Nullable val radio: String?,
    @ColumnInfo(name = "usb") @Nullable val usb: String?,
    @ColumnInfo(name = "messaging") @Nullable val messaging: String?,
    @ColumnInfo(name = "browser") @Nullable val browser: String?,
    @ColumnInfo(name = "clock") @Nullable val clock: String?,
    @ColumnInfo(name = "alarm") @Nullable val alarm: String?,
    @ColumnInfo(name = "games") @Nullable val games: String?,
    @ColumnInfo(name = "languages") @Nullable val languages: String?,
    @ColumnInfo(name = "java") @Nullable val java: String?,
    @ColumnInfo(name = "features_c") @Nullable val features_c: String?,
    @ColumnInfo(name = "battery_c") @Nullable val battery_c: String?,
    @ColumnInfo(name = "stand_by") @Nullable val stand_by: String?,
    @ColumnInfo(name = "talk_time") @Nullable val talk_time: String?,
    @ColumnInfo(name = "colors") @Nullable val colors: String?,
    @ColumnInfo(name = "sensors") @Nullable val sensors: String?,
    @ColumnInfo(name = "cpu") @Nullable val cpu: String?,
    @ColumnInfo(name = "internal") @Nullable val internal: String?,
    @ColumnInfo(name = "os") @Nullable val os: String?,
    @ColumnInfo(name = "body_c") @Nullable val body_c: String?,
    @ColumnInfo(name = "keyboard") @Nullable val keyboard: String?,
    @ColumnInfo(name = "primary_") @Nullable val primary_: String?,
    @ColumnInfo(name = "video") @Nullable val video: String?,
    @ColumnInfo(name = "secondary") @Nullable val secondary: String?,
    @ColumnInfo(name = "speed") @Nullable val speed: String?,
    @ColumnInfo(name = "network_c") @Nullable val network_c: String?,
    @ColumnInfo(name = "chipset") @Nullable val chipset: String?,
    @ColumnInfo(name = "features") @Nullable val features: String?,
    @ColumnInfo(name = "music_play") @Nullable val music_play: String?,
    @ColumnInfo(name = "protection") @Nullable val protection: String?,
    @ColumnInfo(name = "gpu") @Nullable val gpu: String?,
    @ColumnInfo(name = "multitouch") @Nullable val multitouch: String?,
    @ColumnInfo(name = "loudspeaker") @Nullable val loudspeaker: String?,
    @ColumnInfo(name = "audio_quality") @Nullable val audio_quality: String?,
    @ColumnInfo(name = "nfc") @Nullable val nfc: String?,
    @ColumnInfo(name = "camera") @Nullable val camera: String?,
    @ColumnInfo(name = "display") @Nullable val display: String?,
    @ColumnInfo(name = "battery_life") @Nullable val battery_life: String?,
    @ColumnInfo(name = "_2g_bands") @Nullable val _2g_bands: String?,
    @ColumnInfo(name = "_3g_bands") @Nullable val _3g_bands: String?,
    @ColumnInfo(name = "_4g_bands") @Nullable val _4g_bands: String?
)
