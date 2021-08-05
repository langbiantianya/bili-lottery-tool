package serializationData.videoInf.data

import serializationData.videoInf.data.desc_v2.Desc_v2
import serializationData.videoInf.data.dimension.Dimension
import serializationData.videoInf.data.owner.Owner
import serializationData.videoInf.data.pages.Pages
import serializationData.videoInf.data.rights.Rights
import serializationData.videoInf.data.stat.Stat
import serializationData.videoInf.data.subtitle.Subtitle
import serializationData.videoInf.data.user_garb.User_garb

data class Data(
    val bvid: String,
    val aid: Int,
    val videos: Int,
    val tid: Int,
    val tname: String,
    val copyright: Int,
    val pic: String,
    val title: String,
    val pubdate: Int,
    val ctime: Int,
    val desc: String,
    val desc_v2: List<Desc_v2>,
    val state: Int,
    val duration: Int,
    val rights: Rights,
    val owner: Owner,
    val stat: Stat,
    val dynamic: String,
    val cid: Int,
    val dimension: Dimension,
    val no_cache: Boolean,
    val pages: List<Pages>,
    val subtitle: Subtitle,
    val user_garb: User_garb
)
