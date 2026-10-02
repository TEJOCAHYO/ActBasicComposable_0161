package com.example.actbasiccomposable_0161

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actbasiccomposable_0161.ui.theme.ActBasicComposable_0161Theme

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    // 1. Box Terluar: Untuk Background Foto Layar Penuh
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        // --- GAMBAR BACKGROUND LAYAR UTAMA ---
        Image(
            painter = painterResource(id = R.drawable.kabah),
            contentDescription = "Background Masjid",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // 2. Lapisan Konten
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp, start = 20.dp, end = 20.dp, bottom = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header Text Login
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1E40AF)
            )
            Text(
                text = "Ini adalah halaman login.",
                fontSize = 14.sp,
                color = Color.DarkGray
            )

            Spacer(modifier = Modifier.height(20.dp))

            // 3. Card Semi-Transparan Melengkung (Bentuk Kubah)
            Card(
                shape = RoundedCornerShape(
                    topStart = 80.dp,
                    topEnd = 80.dp,
                    bottomStart = 40.dp,
                    bottomEnd = 40.dp
                ),
                // Diubah menjadi semi-transparan 50%
                colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.5f)),
                elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
                modifier = Modifier
                    .fillMaxWidth(0.88f)
                    .wrapContentHeight()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp, horizontal = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // --- LOGO UMY ---
                    Image(
                        painter = painterResource(id = R.drawable.umy),
                        contentDescription = "Logo UMY",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(105.dp)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Label "Nama" (Merah)
                    Text(
                        text = "Nama",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFFDC2626)
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    // Nama Mahasiswa (Biru)
                    Text(
                        text = "Tejo Cahyo Kuncoro",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1E40AF)
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    // NIM Mahasiswa (Hitam Tebal)
                    Text(
                        text = "20240140161",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color(0xFF111827)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    // --- 4. LINGKARAN FOTO BAWAH ---
                    Box(
                        modifier = Modifier
                            .size(200.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.2f))
                            .border(BorderStroke(4.dp, Color.White), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.owi),
                            contentDescription = "Foto Bawah",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(CircleShape)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TugasLoginPreview() {
    ActBasicComposable_0161Theme {
        LoginScreen()
    }
}