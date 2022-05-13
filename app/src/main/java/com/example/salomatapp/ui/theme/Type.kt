package com.example.salomatapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.salomatapp.R

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)

val NotoSansLight = FontFamily(Font(R.font.noto_sans_light))
val NotoSansRegular = FontFamily(Font(R.font.noto_sans_regular))
val NotoSansMedium = FontFamily(Font(R.font.noto_sans_medium))
