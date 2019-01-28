package android.pointblanck.com.dota.heroes

import com.google.gson.annotations.SerializedName

data class HeroStat(
    @SerializedName("1_pick")
    var pick_1: Float?,
    @SerializedName("1_win")
    var win_1: Float?,
    @SerializedName("2_pick")
    var pick_2: Float?,
    @SerializedName("2_win")
    var win_2: Float?,
    @SerializedName("3_pick")
    var pick_3: Float?,
    @SerializedName("3_win")
    var win_3: Float?,
    @SerializedName("4_pick")
    var pick_4: Float?,
    @SerializedName("4_win")
    var win_4: Float?,
    @SerializedName("5_pick")
    var pick_5: Float?,
    @SerializedName("5_win")
    var win_5: Float?,
    @SerializedName("6_pick")
    var pick_6: Float?,
    @SerializedName("6_win")
    var win_6: Float?,
    @SerializedName("7_pick")
    var pick_7: Float?,
    @SerializedName("7_win")
    var win_7: Float?,
    @SerializedName("8_pick")
    var pick_8: Float?,
    @SerializedName("8_win")
    var win_8: Float?,
    @SerializedName("agi_gain")
    var agiGain: Double?,
    @SerializedName("attack_range")
    var attackRange: Int?,
    @SerializedName("attack_rate")
    var attackRate: Double?,
    @SerializedName("attack_type")
    var attackType: String?,
    @SerializedName("base_agi")
    var baseAgi: Float?,
    @SerializedName("base_armor")
    var baseArmor: Float?,
    @SerializedName("base_attack_max")
    var baseAttackMax: Float?,
    @SerializedName("base_attack_min")
    var baseAttackMin: Float?,
    @SerializedName("base_health")
    var baseHealth: Float?,
    @SerializedName("base_health_regen")
    var baseHealthRegen: Double?,
    @SerializedName("base_int")
    var baseInt: Float?,
    @SerializedName("base_mana")
    var baseMana: Float?,
    @SerializedName("base_mana_regen")
    var baseManaRegen: Float?,
    @SerializedName("base_mr")
    var baseMr: Float?,
    @SerializedName("base_str")
    var baseStr: Float?,
    @SerializedName("cm_enabled")
    var cmEnabled: Boolean?,
    @SerializedName("hero_id")
    var heroId: Float?,
    @SerializedName("icon")
    var icon: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("img")
    var img: String?,
    @SerializedName("int_gain")
    var intGain: Double?,
    @SerializedName("legs")
    var legs: Int?,
    @SerializedName("localized_name")
    var localizedName: String?,
    @SerializedName("move_speed")
    var moveSpeed: Float?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("primary_attr")
    var primaryAttr: String?,
    @SerializedName("pro_ban")
    var proBan: Float?,
    @SerializedName("pro_pick")
    var proPick: Float?,
    @SerializedName("pro_win")
    var proWin: Float?,
    @SerializedName("projectile_speed")
    var projectileSpeed: Float?,
    @SerializedName("roles")
    var roles: List<String?>?,
    @SerializedName("str_gain")
    var strGain: Double?,
    @SerializedName("turn_rate")
    var turnRate: Double?
)