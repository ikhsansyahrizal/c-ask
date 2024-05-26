plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
    id ("kotlin-parcelize")
    id ("com.google.dagger.hilt.android")
    id ("kotlin-kapt")
//    id ("com.google.gms.google-services")

}
android {
    namespace = "com.example.c_ask"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.c_ask"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}


dependencies {

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //Lifecycle
    implementation("androidx.lifecycle:lifecycle-process:2.7.0")

    //Navigation
    val navigation_version = "2.6.0"
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.7")
    implementation ("androidx.fragment:fragment-ktx:1.7.1")


    //hilt
    implementation ("com.google.dagger:hilt-android:2.48")
    kapt ("com.google.dagger:hilt-compiler:2.48")

    //ViewPager2
//    implementation ("androidx.viewpager2:viewpager2:1.0.0")

    //Glide
    implementation ("com.github.bumptech.glide:glide:4.4.0")
    kapt ("com.github.bumptech.glide:compiler:4.4.0")

    //DotsIndicator
//    implementation("com.tbuonomo:dotsindicator:5.0")

    //splash
//    implementation ("androidx.core:core-splashscreen:1.0.0")

    //retrofit
    //Retrofit
//    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
//    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
//    implementation ("com.squareup.retrofit2:converter-scalars:2.1.0")
//    implementation ("com.squareup.okhttp3:logging-interceptor:4.10.0")
//    implementation ("com.squareup.okhttp3:okhttp:4.10.0")
//    implementation ("com.google.code.gson:gson:2.10.1")
//    implementation ("androidx.security:security-crypto:1.1.0-alpha06")
//    implementation ("com.scottyab:rootbeer-lib:0.1.0")
//    implementation ("commons-codec:commons-codec:1.15")

    //timber
    implementation ("com.jakewharton.timber:timber:5.0.1")

    // Mockito
    testImplementation ("org.mockito:mockito-core:3.6.0")
    testImplementation ("org.mockito:mockito-inline:4.4.0")
    testImplementation ("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.2")
    testImplementation ("androidx.arch.core:core-testing:2.1.0")


//    //Firebase
//    val firebase = "30.5.0"
//    implementation ("com.google.firebase:firebase-bom:${firebase}")
//    implementation ("com.google.firebase:firebase-messaging-ktx:23.0.0")
//

    //recylerview
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("androidx.recyclerview:recyclerview:1.3.2")

}