# Mapping Driver Navigation App

A specialized Android application designed for street view/mapping drivers to efficiently cover and track route coverage in designated areas.

## Features

### Core Functionality
- **Manual Route Drawing**: Draw custom routes on the map for areas that need to be covered
- **Starting Point Placement**: Set specific starting points for route navigation
- **Turn-by-Turn Navigation**: Generate navigation guidance for drawn routes
- **Real-Time GPS Tracking**: Continuous location tracking with high accuracy
- **Visual Route Progress**: 
  - Green lines for covered routes
  - Blue lines for uncovered routes
- **Obstacle Management**: Drop pins for inaccessible routes with automatic rerouting
- **Route Management**: Save, load, and edit custom routes

### Advanced Features
- **Offline Maps**: Download maps for offline use
- **Data Export**: Export coverage data and reports
- **Battery Optimization**: Efficient GPS tracking with power management
- **Photo Integration**: Geotagged photo capture for street view documentation

## Technology Stack

- **Language**: Kotlin
- **IDE**: Android Studio
- **Minimum SDK**: API 24 (Android 7.0)
- **Target SDK**: API 34 (Android 14)
- **Maps**: Google Maps SDK for Android
- **Location**: Google Play Services Location API
- **Database**: Room (SQLite)
- **Architecture**: MVVM with LiveData and Coroutines

## Setup Instructions

### Prerequisites
1. **Android Studio** (Latest stable version)
2. **Google Cloud Console Account** for Maps API
3. **Android device** with GPS capability for testing

### Step 1: Clone/Download Project
```bash
# If using git
git clone <repository-url>
cd android-mapping-app

# Or download and extract the project files
```

### Step 2: Google Maps API Setup
1. Go to [Google Cloud Console](https://console.cloud.google.com/)
2. Create a new project or select existing project
3. Enable the following APIs:
   - Maps SDK for Android
   - Places API
   - Directions API
   - Geocoding API
4. Create credentials (API Key)
5. Restrict the API key to Android apps
6. Add your app's package name: `com.mappingdriver.navigation`
7. Add your app's SHA-1 fingerprint

### Step 3: Configure API Key
1. Open `local.properties` file
2. Replace `YOUR_GOOGLE_MAPS_API_KEY_HERE` with your actual API key:
```properties
MAPS_API_KEY=AIzaSyBvOkBwgGlbUiuS-oSiQHkmOFXkKaRdTAA
```

### Step 4: Build and Run
1. Open project in Android Studio
2. Sync project with Gradle files
3. Connect Android device or start emulator
4. Run the app (Ctrl+R or click Run button)

## Project Structure

```
app/
├── src/main/
│   ├── java/com/mappingdriver/navigation/
│   │   ├── MainActivity.kt                 # Main entry point
│   │   ├── ui/
│   │   │   ├── map/                       # Map-related activities
│   │   │   ├── routes/                    # Route management
│   │   │   └── settings/                  # App settings
│   │   ├── services/
│   │   │   ├── LocationTrackingService.kt # GPS tracking service
│   │   │   └── NavigationService.kt       # Navigation logic
│   │   ├── data/
│   │   │   ├── database/                  # Room database
│   │   │   ├── models/                    # Data models
│   │   │   └── repositories/              # Data repositories
│   │   └── utils/                         # Utility classes
│   ├── res/
│   │   ├── layout/                        # XML layouts
│   │   ├── drawable/                      # Icons and graphics
│   │   ├── values/                        # Colors, strings, themes
│   │   └── xml/                           # Configuration files
│   └── AndroidManifest.xml               # App configuration
└── build.gradle.kts                      # App dependencies
```

## Development Phases

### ✅ Phase 1: Project Setup & Environment (COMPLETED)
- [x] Android project structure
- [x] Dependencies configuration
- [x] Basic UI layouts
- [x] Permissions setup
- [x] Google Maps integration setup

### 🔄 Phase 2: Core Mapping Infrastructure (NEXT)
- [ ] Google Maps integration
- [ ] Location services setup
- [ ] Basic map functionality
- [ ] Permission handling

### 📋 Upcoming Phases
- **Phase 3**: Route Drawing System
- **Phase 4**: Navigation Engine
- **Phase 5**: Real-time Tracking System
- **Phase 6**: Obstacle Management
- **Phase 7**: Advanced Features
- **Phase 8**: Testing & Optimization

## Permissions Required

The app requires the following permissions:
- `ACCESS_FINE_LOCATION` - High accuracy GPS
- `ACCESS_COARSE_LOCATION` - Network-based location
- `ACCESS_BACKGROUND_LOCATION` - Background tracking
- `WRITE_EXTERNAL_STORAGE` - Save route data
- `FOREGROUND_SERVICE` - Continuous tracking
- `INTERNET` - Map data and navigation

## Usage Instructions

### Getting Started
1. Launch the app
2. Grant location permissions when prompted
3. Tap "Start Mapping" to begin

### Drawing Routes
1. Open the map interface
2. Use drawing tools to trace routes
3. Set starting points with long press
4. Save routes for later use

### Navigation Mode
1. Select a saved route
2. Choose starting point
3. Tap "Start Navigation"
4. Follow turn-by-turn directions

### Tracking Progress
- Green lines show covered areas
- Blue lines show remaining routes
- Drop pins for blocked areas
- View progress percentage in real-time

## Troubleshooting

### Common Issues
1. **Maps not loading**: Check API key configuration
2. **GPS not working**: Ensure location permissions granted
3. **App crashes**: Check device compatibility (API 24+)

### Debug Steps
1. Check `local.properties` for correct API key
2. Verify Google Cloud Console API settings
3. Ensure device has GPS capability
4. Check Android Studio logcat for errors

## Contributing

This is a specialized app for mapping drivers. For feature requests or bug reports, please document:
1. Device model and Android version
2. Steps to reproduce issue
3. Expected vs actual behavior
4. Screenshots if applicable

## License

This project is designed for professional mapping and street view documentation purposes.

---

**Next Steps**: Ready to proceed to Phase 2 - Core Mapping Infrastructure
