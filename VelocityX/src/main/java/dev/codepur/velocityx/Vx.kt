package dev.codepur.velocityx

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import java.util.*

class Vx {

    /// Pixel Values
    companion object {
        val dp0: Dp = 0.0.dp
        val dp2: Dp = 2.0.dp
        val dp1: Dp = 1.0.dp
        val dp3: Dp = 3.0.dp
        val dp4: Dp = 4.0.dp
        val dp5: Dp = 5.0.dp
        val dp6: Dp = 6.0.dp
        val dp8: Dp = 8.0.dp
        val dp10: Dp = 10.0.dp
        val dp12: Dp = 12.0.dp
        val dp14: Dp = 14.0.dp
        val dp16: Dp = 16.0.dp
        val dp20: Dp = 20.0.dp
        val dp24: Dp = 24.0.dp
        val dp32: Dp = 32.0.dp
        val dp40: Dp = 40.0.dp
        val dp48: Dp = 48.0.dp
        val dp56: Dp = 56.0.dp
        val dp64: Dp = 64.0.dp

        ///Colors
        const val blackHex: String = "#000000"
        const val whiteHex: String = "#ffffff"

        val black: Color = Color(0xFF000000)
        val white: Color = Color(0xFFFFFFFF)

        ///Gray Colors
        const val grayHex50: String = "#f9fafb"
        const val grayHex100: String = "#f3f4f6"
        const val grayHex200: String = "#e5e7eb"
        const val grayHex300: String = "#d1d5db"
        const val grayHex400: String = "#9ca3af"
        const val grayHex500: String = "#6b7280"
        const val grayHex600: String = "#4b5563"
        const val grayHex700: String = "#374151"
        const val grayHex800: String = "#1f2937"
        const val grayHex900: String = "#111827"

        val gray50: Color = Color(0xFFf9fafb)
        val gray100: Color = Color(0xFFf3f4f6)
        val gray200: Color = Color(0xFFe5e7eb)
        val gray300: Color = Color(0xFFd1d5db)
        val gray400: Color = Color(0xFF9ca3af)
        val gray500: Color = Color(0xFF6b7280)
        val gray600: Color = Color(0xFF4b5563)
        val gray700: Color = Color(0xFF374151)
        val gray800: Color = Color(0xFF1f2937)
        val gray900: Color = Color(0xFF111827)

        // Slate Colors
        const val slateHex50: String = "#f8fafc"
        const val slateHex100: String = "#f1f5f9"
        const val slateHex200: String = "#e2e8f0"
        const val slateHex300: String = "#cbd5e1"
        const val slateHex400: String = "#94a3b8"
        const val slateHex500: String = "#64748b"
        const val slateHex600: String = "#475569"
        const val slateHex700: String = "#334155"
        const val slateHex800: String = "#1e293b"
        const val slateHex900: String = "#0f172a"

        val slate50: Color = Color(0xFFf8fafc)
        val slate100: Color = Color(0xFFf1f5f9)
        val slate200: Color = Color(0xFFe2e8f0)
        val slate300: Color = Color(0xFFcbd5e1)
        val slate400: Color = Color(0xFF94a3b8)
        val slate500: Color = Color(0xFF64748b)
        val slate600: Color = Color(0xFF475569)
        val slate700: Color = Color(0xFF334155)
        val slate800: Color = Color(0xFF1e293b)
        val slate900: Color = Color(0xFF0f172a)

        // Zinc Colors
        const val zincHex50: String = "#fafafa"
        const val zincHex100: String = "#f4f4f5"
        const val zincHex200: String = "#e4e4e7"
        const val zincHex300: String = "#d4d4d8"
        const val zincHex400: String = "#a1a1aa"
        const val zincHex500: String = "#71717a"
        const val zincHex600: String = "#52525b"
        const val zincHex700: String = "#3f3f46"
        const val zincHex800: String = "#27272a"
        const val zincHex900: String = "#18181b"

        val zinc50: Color = Color(0xFFfafafa)
        val zinc100: Color = Color(0xFFf4f4f5)
        val zinc200: Color = Color(0xFFe4e4e7)
        val zinc300: Color = Color(0xFFd4d4d8)
        val zinc400: Color = Color(0xFFa1a1aa)
        val zinc500: Color = Color(0xFF71717a)
        val zinc600: Color = Color(0xFF52525b)
        val zinc700: Color = Color(0xFF3f3f46)
        val zinc800: Color = Color(0xFF27272a)
        val zinc900: Color = Color(0xFF18181b)

        // Stone Colors
        const val stoneHex50: String = "#FAFAF9"
        const val stoneHex100: String = "#F5F5F4"
        const val stoneHex200: String = "#E7E5E4"
        const val stoneHex300: String = "#D6D3D1"
        const val stoneHex400: String = "#A8A29E"
        const val stoneHex500: String = "#78716C"
        const val stoneHex600: String = "#57534E"
        const val stoneHex700: String = "#44403C"
        const val stoneHex800: String = "#292524"
        const val stoneHex900: String = "#1C1917"

        val stone50: Color = Color(0xFFFAFAF9)
        val stone100: Color = Color(0xFFF5F5F4)
        val stone200: Color = Color(0xFFE7E5E4)
        val stone300: Color = Color(0xFFD6D3D1)
        val stone400: Color = Color(0xFFA8A29E)
        val stone500: Color = Color(0xFF78716C)
        val stone600: Color = Color(0xFF57534E)
        val stone700: Color = Color(0xFF44403C)
        val stone800: Color = Color(0xFF292524)
        val stone900: Color = Color(0xFF1C1917)

        // Neutral Colors
        const val neutralHex50: String = "#fafafa"
        const val neutralHex100: String = "#f5f5f5"
        const val neutralHex200: String = "#e5e5e5"
        const val neutralHex300: String = "#d4d4d4"
        const val neutralHex400: String = "#a3a3a3"
        const val neutralHex500: String = "#737373"
        const val neutralHex600: String = "#525252"
        const val neutralHex700: String = "#404040"
        const val neutralHex800: String = "#262626"
        const val neutralHex900: String = "#171717"

        val neutral50: Color = Color(0xFFfafafa)
        val neutral100: Color = Color(0xFFf5f5f5)
        val neutral200: Color = Color(0xFFe5e5e5)
        val neutral300: Color = Color(0xFFd4d4d4)
        val neutral400: Color = Color(0xFFa3a3a3)
        val neutral500: Color = Color(0xFF737373)
        val neutral600: Color = Color(0xFF525252)
        val neutral700: Color = Color(0xFF404040)
        val neutral800: Color = Color(0xFF262626)
        val neutral900: Color = Color(0xFF171717)

        ///Red Colors
        const val redHex50: String = "#FEF2F2"
        const val redHex100: String = "#FEE2E2"
        const val redHex200: String = "#FECACA"
        const val redHex300: String = "#FCA5A5"
        const val redHex400: String = "#F87171"
        const val redHex500: String = "#EF4444"
        const val redHex600: String = "#DC2626"
        const val redHex700: String = "#B91C1C"
        const val redHex800: String = "#991B1B"
        const val redHex900: String = "#7F1D1D"

        val red50: Color = Color(0xFFFEF2F2)
        val red100: Color = Color(0xFFFEE2E2)
        val red200: Color = Color(0xFFFECACA)
        val red300: Color = Color(0xFFFCA5A5)
        val red400: Color = Color(0xFFF87171)
        val red500: Color = Color(0xFFEF4444)
        val red600: Color = Color(0xFFDC2626)
        val red700: Color = Color(0xFFB91C1C)
        val red800: Color = Color(0xFF991B1B)
        val red900: Color = Color(0xFF7F1D1D)

        ///Orange Colors
        const val orangeHex50: String = "#FFF7ED"
        const val orangeHex100: String = "#FFEDD5"
        const val orangeHex200: String = "#FED7AA"
        const val orangeHex300: String = "#FDBA74"
        const val orangeHex400: String = "#FB923C"
        const val orangeHex500: String = "#F97316"
        const val orangeHex600: String = "#EA580C"
        const val orangeHex700: String = "#C2410C"
        const val orangeHex800: String = "#9A3412"
        const val orangeHex900: String = "#7C2D12"

        val orange50: Color = Color(0xFFFFF7ED)
        val orange100: Color = Color(0xFFFFEDD5)
        val orange200: Color = Color(0xFFFED7AA)
        val orange300: Color = Color(0xFFFDBA74)
        val orange400: Color = Color(0xFFFB923C)
        val orange500: Color = Color(0xFFF97316)
        val orange600: Color = Color(0xFFEA580C)
        val orange700: Color = Color(0xFFC2410C)
        val orange800: Color = Color(0xFF9A3412)
        val orange900: Color = Color(0xFF7C2D12)

        ///Amber Colors
        const val amberHex50: String = "#FFFBEB"
        const val amberHex100: String = "#FEF3C7"
        const val amberHex200: String = "#FDE68A"
        const val amberHex300: String = "#FCD34D"
        const val amberHex400: String = "#FBBF24"
        const val amberHex500: String = "#F59E0B"
        const val amberHex600: String = "#D97706"
        const val amberHex700: String = "#B45309"
        const val amberHex800: String = "#92400E"
        const val amberHex900: String = "#78350F"

        val amber50: Color = Color(0xFFFFFBEB)
        val amber100: Color = Color(0xFFFEF3C7)
        val amber200: Color = Color(0xFFFDE68A)
        val amber300: Color = Color(0xFFFCD34D)
        val amber400: Color = Color(0xFFFBBF24)
        val amber500: Color = Color(0xFFF59E0B)
        val amber600: Color = Color(0xFFD97706)
        val amber700: Color = Color(0xFFB45309)
        val amber800: Color = Color(0xFF92400E)
        val amber900: Color = Color(0xFF78350F)

        ///Yellow Colors
        const val yellowHex50: String = "#FEFCE8"
        const val yellowHex100: String = "#FEF9C3"
        const val yellowHex200: String = "#FEF08A"
        const val yellowHex300: String = "#FDE047"
        const val yellowHex400: String = "#FACC15"
        const val yellowHex500: String = "#EAB308"
        const val yellowHex600: String = "#CA8A04"
        const val yellowHex700: String = "#A16207"
        const val yellowHex800: String = "#854D0E"
        const val yellowHex900: String = "#713F12"

        val yellow50: Color = Color(0xFFFEFCE8)
        val yellow100: Color = Color(0xFFFEF9C3)
        val yellow200: Color = Color(0xFFFEF08A)
        val yellow300: Color = Color(0xFFFDE047)
        val yellow400: Color = Color(0xFFFACC15)
        val yellow500: Color = Color(0xFFEAB308)
        val yellow600: Color = Color(0xFFCA8A04)
        val yellow700: Color = Color(0xFFA16207)
        val yellow800: Color = Color(0xFF854D0E)
        val yellow900: Color = Color(0xFF713F12)

        ///Lime Colors
        const val limeHex50: String = "#F7FEE7"
        const val limeHex100: String = "#ECFCCB"
        const val limeHex200: String = "#D9F99D"
        const val limeHex300: String = "#BEF264"
        const val limeHex400: String = "#A3E635"
        const val limeHex500: String = "#84CC16"
        const val limeHex600: String = "#65A30D"
        const val limeHex700: String = "#4D7C0F"
        const val limeHex800: String = "#3F6212"
        const val limeHex900: String = "#365314"

        val lime50: Color = Color(0xFFF7FEE7)
        val lime100: Color = Color(0xFFECFCCB)
        val lime200: Color = Color(0xFFD9F99D)
        val lime300: Color = Color(0xFFBEF264)
        val lime400: Color = Color(0xFFA3E635)
        val lime500: Color = Color(0xFF84CC16)
        val lime600: Color = Color(0xFF65A30D)
        val lime700: Color = Color(0xFF4D7C0F)
        val lime800: Color = Color(0xFF3F6212)
        val lime900: Color = Color(0xFF365314)

        ///Green Colors
        const val greenHex50: String = "#F0FDF4"
        const val greenHex100: String = "#DCFCE7"
        const val greenHex200: String = "#BBF7D0"
        const val greenHex300: String = "#86EFAC"
        const val greenHex400: String = "#4ADE80"
        const val greenHex500: String = "#22C55E"
        const val greenHex600: String = "#16A34A"
        const val greenHex700: String = "#15803D"
        const val greenHex800: String = "#166534"
        const val greenHex900: String = "#14532D"

        val green50: Color = Color(0xFFF0FDF4)
        val green100: Color = Color(0xFFDCFCE7)
        val green200: Color = Color(0xFFBBF7D0)
        val green300: Color = Color(0xFF86EFAC)
        val green400: Color = Color(0xFF4ADE80)
        val green500: Color = Color(0xFF22C55E)
        val green600: Color = Color(0xFF16A34A)
        val green700: Color = Color(0xFF15803D)
        val green800: Color = Color(0xFF166534)
        val green900: Color = Color(0xFF14532D)

        ///Emerald Colors
        const val emeraldHex50: String = "#ECFDF5"
        const val emeraldHex100: String = "#D1FAE5"
        const val emeraldHex200: String = "#A7F3D0"
        const val emeraldHex300: String = "#6EE7B7"
        const val emeraldHex400: String = "#34D399"
        const val emeraldHex500: String = "#10B981"
        const val emeraldHex600: String = "#059669"
        const val emeraldHex700: String = "#047857"
        const val emeraldHex800: String = "#065F46"
        const val emeraldHex900: String = "#064E3B"

        val emerald50: Color = Color(0xFFECFDF5)
        val emerald100: Color = Color(0xFFD1FAE5)
        val emerald200: Color = Color(0xFFA7F3D0)
        val emerald300: Color = Color(0xFF6EE7B7)
        val emerald400: Color = Color(0xFF34D399)
        val emerald500: Color = Color(0xFF10B981)
        val emerald600: Color = Color(0xFF059669)
        val emerald700: Color = Color(0xFF047857)
        val emerald800: Color = Color(0xFF065F46)
        val emerald900: Color = Color(0xFF064E3B)

        ///Teal Colors
        const val tealHex50: String = "#F0FDFA"
        const val tealHex100: String = "#CCFBF1"
        const val tealHex200: String = "#99F6E4"
        const val tealHex300: String = "#5EEAD4"
        const val tealHex400: String = "#2DD4BF"
        const val tealHex500: String = "#14B8A6"
        const val tealHex600: String = "#0D9488"
        const val tealHex700: String = "#0F766E"
        const val tealHex800: String = "#115E59"
        const val tealHex900: String = "#134E4A"

        val teal50: Color = Color(0xFFF0FDFA)
        val teal100: Color = Color(0xFFCCFBF1)
        val teal200: Color = Color(0xFF99F6E4)
        val teal300: Color = Color(0xFF5EEAD4)
        val teal400: Color = Color(0xFF2DD4BF)
        val teal500: Color = Color(0xFF14B8A6)
        val teal600: Color = Color(0xFF0D9488)
        val teal700: Color = Color(0xFF0F766E)
        val teal800: Color = Color(0xFF115E59)
        val teal900: Color = Color(0xFF134E4A)

        ///Cyan Colors
        const val cyanHex50: String = "#ECFEFF"
        const val cyanHex100: String = "#CFFAFE"
        const val cyanHex200: String = "#A5F3FC"
        const val cyanHex300: String = "#67E8F9"
        const val cyanHex400: String = "#22D3EE"
        const val cyanHex500: String = "#06B6D4"
        const val cyanHex600: String = "#0891B2"
        const val cyanHex700: String = "#0E7490"
        const val cyanHex800: String = "#155E75"
        const val cyanHex900: String = "#164E63"

        val cyan50: Color = Color(0xFFECFEFF)
        val cyan100: Color = Color(0xFFCFFAFE)
        val cyan200: Color = Color(0xFFA5F3FC)
        val cyan300: Color = Color(0xFF67E8F9)
        val cyan400: Color = Color(0xFF22D3EE)
        val cyan500: Color = Color(0xFF06B6D4)
        val cyan600: Color = Color(0xFF0891B2)
        val cyan700: Color = Color(0xFF0E7490)
        val cyan800: Color = Color(0xFF155E75)
        val cyan900: Color = Color(0xFF164E63)

        ///Sky Colors
        const val skyHex50: String = "#F0F9FF"
        const val skyHex100: String = "#E0F2FE"
        const val skyHex200: String = "#BAE6FD"
        const val skyHex300: String = "#7DD3FC"
        const val skyHex400: String = "#38BDF8"
        const val skyHex500: String = "#0EA5E9"
        const val skyHex600: String = "#0284C7"
        const val skyHex700: String = "#0369A1"
        const val skyHex800: String = "#075985"
        const val skyHex900: String = "#0C4A6E"

        val sky50: Color = Color(0xFFF0F9FF)
        val sky100: Color = Color(0xFFE0F2FE)
        val sky200: Color = Color(0xFFBAE6FD)
        val sky300: Color = Color(0xFF7DD3FC)
        val sky400: Color = Color(0xFF38BDF8)
        val sky500: Color = Color(0xFF0EA5E9)
        val sky600: Color = Color(0xFF0284C7)
        val sky700: Color = Color(0xFF0369A1)
        val sky800: Color = Color(0xFF075985)
        val sky900: Color = Color(0xFF0C4A6E)

        ///Blue Colors
        const val blueHex50: String = "#EFF6FF"
        const val blueHex100: String = "#DBEAFE"
        const val blueHex200: String = "#BFDBFE"
        const val blueHex300: String = "#93C5FD"
        const val blueHex400: String = "#60A5FA"
        const val blueHex500: String = "#3B82F6"
        const val blueHex600: String = "#2563EB"
        const val blueHex700: String = "#1D4ED8"
        const val blueHex800: String = "#1E40AF"
        const val blueHex900: String = "#1E3A8A"

        val blue50: Color = Color(0xFFEFF6FF)
        val blue100: Color = Color(0xFFDBEAFE)
        val blue200: Color = Color(0xFFBFDBFE)
        val blue300: Color = Color(0xFF93C5FD)
        val blue400: Color = Color(0xFF60A5FA)
        val blue500: Color = Color(0xFF3B82F6)
        val blue600: Color = Color(0xFF2563EB)
        val blue700: Color = Color(0xFF1D4ED8)
        val blue800: Color = Color(0xFF1E40AF)
        val blue900: Color = Color(0xFF1E3A8A)

        ///Indigo Colors
        const val indigoHex50: String = "#EEF2FF"
        const val indigoHex100: String = "#E0E7FF"
        const val indigoHex200: String = "#C7D2FE"
        const val indigoHex300: String = "#A5B4FC"
        const val indigoHex400: String = "#818CF8"
        const val indigoHex500: String = "#6366F1"
        const val indigoHex600: String = "#4F46E5"
        const val indigoHex700: String = "#4338CA"
        const val indigoHex800: String = "#3730A3"
        const val indigoHex900: String = "#312E81"

        val indigo50: Color = Color(0xFFEEF2FF)
        val indigo100: Color = Color(0xFFE0E7FF)
        val indigo200: Color = Color(0xFFC7D2FE)
        val indigo300: Color = Color(0xFFA5B4FC)
        val indigo400: Color = Color(0xFF818CF8)
        val indigo500: Color = Color(0xFF6366F1)
        val indigo600: Color = Color(0xFF4F46E5)
        val indigo700: Color = Color(0xFF4338CA)
        val indigo800: Color = Color(0xFF3730A3)
        val indigo900: Color = Color(0xFF312E81)

        ///Violet Colors
        const val violetHex50: String = "#F5F3FF"
        const val violetHex100: String = "#EDE9FE"
        const val violetHex200: String = "#DDD6FE"
        const val violetHex300: String = "#C4B5FD"
        const val violetHex400: String = "#A78BFA"
        const val violetHex500: String = "#8B5CF6"
        const val violetHex600: String = "#7C3AED"
        const val violetHex700: String = "#6D28D9"
        const val violetHex800: String = "#5B21B6"
        const val violetHex900: String = "#4C1D95"

        val violet50: Color = Color(0xFFF5F3FF)
        val violet100: Color = Color(0xFFEDE9FE)
        val violet200: Color = Color(0xFFDDD6FE)
        val violet300: Color = Color(0xFFC4B5FD)
        val violet400: Color = Color(0xFFA78BFA)
        val violet500: Color = Color(0xFF8B5CF6)
        val violet600: Color = Color(0xFF7C3AED)
        val violet700: Color = Color(0xFF6D28D9)
        val violet800: Color = Color(0xFF5B21B6)
        val violet900: Color = Color(0xFF4C1D95)

        ///Purple Colors
        const val purpleHex50: String = "#FAF5FF"
        const val purpleHex100: String = "#F3E8FF"
        const val purpleHex200: String = "#E9D5FF"
        const val purpleHex300: String = "#D8B4FE"
        const val purpleHex400: String = "#C084FC"
        const val purpleHex500: String = "#A855F7"
        const val purpleHex600: String = "#9333EA"
        const val purpleHex700: String = "#7E22CE"
        const val purpleHex800: String = "#6B21A8"
        const val purpleHex900: String = "#581C87"

        val purple50: Color = Color(0xFFFAF5FF)
        val purple100: Color = Color(0xFFF3E8FF)
        val purple200: Color = Color(0xFFE9D5FF)
        val purple300: Color = Color(0xFFD8B4FE)
        val purple400: Color = Color(0xFFC084FC)
        val purple500: Color = Color(0xFFA855F7)
        val purple600: Color = Color(0xFF9333EA)
        val purple700: Color = Color(0xFF7E22CE)
        val purple800: Color = Color(0xFF6B21A8)
        val purple900: Color = Color(0xFF581C87)

        ///Fuchsia Colors
        const val fuchsiaHex50: String = "#FDF4FF"
        const val fuchsiaHex100: String = "#FAE8FF"
        const val fuchsiaHex200: String = "#F5D0FE"
        const val fuchsiaHex300: String = "#F0ABFC"
        const val fuchsiaHex400: String = "#E879F9"
        const val fuchsiaHex500: String = "#D946EF"
        const val fuchsiaHex600: String = "#C026D3"
        const val fuchsiaHex700: String = "#A21CAF"
        const val fuchsiaHex800: String = "#86198F"
        const val fuchsiaHex900: String = "#701A75"

        val fuchsia50: Color = Color(0xFFFDF4FF)
        val fuchsia100: Color = Color(0xFFFAE8FF)
        val fuchsia200: Color = Color(0xFFF5D0FE)
        val fuchsia300: Color = Color(0xFFF0ABFC)
        val fuchsia400: Color = Color(0xFFE879F9)
        val fuchsia500: Color = Color(0xFFD946EF)
        val fuchsia600: Color = Color(0xFFC026D3)
        val fuchsia700: Color = Color(0xFFA21CAF)
        val fuchsia800: Color = Color(0xFF86198F)
        val fuchsia900: Color = Color(0xFF701A75)

        ///Pink Colors
        const val pinkHex50: String = "#FDF2F8"
        const val pinkHex100: String = "#FCE7F3"
        const val pinkHex200: String = "#FBCFE8"
        const val pinkHex300: String = "#F9A8D4"
        const val pinkHex400: String = "#F472B6"
        const val pinkHex500: String = "#EC4899"
        const val pinkHex600: String = "#DB2777"
        const val pinkHex700: String = "#BE185D"
        const val pinkHex800: String = "#9D174D"
        const val pinkHex900: String = "#831843"

        val pink50: Color = Color(0xFFFDF2F8)
        val pink100: Color = Color(0xFFFCE7F3)
        val pink200: Color = Color(0xFFFBCFE8)
        val pink300: Color = Color(0xFFF9A8D4)
        val pink400: Color = Color(0xFFF472B6)
        val pink500: Color = Color(0xFFEC4899)
        val pink600: Color = Color(0xFFDB2777)
        val pink700: Color = Color(0xFFBE185D)
        val pink800: Color = Color(0xFF9D174D)
        val pink900: Color = Color(0xFF831843)

        ///Rose Colors
        const val roseHex50: String = "#FFF1F2"
        const val roseHex100: String = "#FFE4E6"
        const val roseHex200: String = "#FECDD3"
        const val roseHex300: String = "#FDA4AF"
        const val roseHex400: String = "#FB7185"
        const val roseHex500: String = "#F43F5E"
        const val roseHex600: String = "#E11D48"
        const val roseHex700: String = "#BE123C"
        const val roseHex800: String = "#9F1239"
        const val roseHex900: String = "#881337"

        val rose50: Color = Color(0xFFFFF1F2)
        val rose100: Color = Color(0xFFFFE4E6)
        val rose200: Color = Color(0xFFFECDD3)
        val rose300: Color = Color(0xFFFDA4AF)
        val rose400: Color = Color(0xFFFB7185)
        val rose500: Color = Color(0xFFF43F5E)
        val rose600: Color = Color(0xFFE11D48)
        val rose700: Color = Color(0xFFBE123C)
        val rose800: Color = Color(0xFF9F1239)
        val rose900: Color = Color(0xFF881337)


        /// Get color from the hex value
        fun hexToColor(code: String): Color =
            Color(android.graphics.Color.parseColor(code))

        /// Get Random Non-Primary Color
        val randomOpaqueColor: Color
            get() = Color(Random().nextInt(0xffffff)).copy(alpha = 1.0f)


        ///Padding
        /// All Fixed EdgeInsets
        var m0: PaddingValues? = PaddingValues(all = 0.dp)
        var m1: PaddingValues? = PaddingValues(all = 1.dp)
        var m2: PaddingValues? = PaddingValues(all = 2.dp)

    }
}