# Lumina - Book Library App 📚

Lumina is a feature-rich, optimized, and user-friendly e-book library app designed for book lovers. Built with Kotlin and Jetpack Compose, Lumina offers a seamless reading experience with a vast collection of e-books, intuitive UI, and efficient data management using Firebase Realtime Database and Room Database.

## 📌 Key Features

* 📖 **Vast E-Book Library** – Utilized Firebase Realtime Database to store and manage books across multiple genres. Users can browse books in real-time and filter them by genre, author, or popularity.
* 📖 **Built-in Reader** – Integrated a PDF reader using the Android PDFView library, supporting features like pinch-to-zoom, text highlighting, and bookmarks. Efficiently renders large e-books using ViewModel and Jetpack Compose.
* 📖 **Bookmark & Favorites** – Implemented a Bookmark and Favorites system using Room Database for offline storage, synchronized with Firebase for cross-device access.
* 📖 **Offline Reading Mode** – Allows users to download books for offline access, managed using Room Database and WorkManager for background tasks.
* 📖 **Realtime Database** – Firebase Realtime Database for efficient, real-time data fetching and management. Firebase Cloud Functions for notifications and data management.
* 🌙 **Dark Mode Support** – Integrated dark mode using Jetpack Compose's theming capabilities for a comfortable reading experience.
* ⚡ **Smooth UI/UX** – Built with Jetpack Compose, following modern Android design principles with a dynamic Navigation Drawer.
* 📑 **Navigation Drawer** – Streamlined user experience with an efficient design for quick access to key sections.

## 🚀 Technologies Used

* **Kotlin** – Language used for Android app development.
* **Jetpack Compose** – Modern UI toolkit for building native Android apps.
* **Firebase Realtime Database** – Cloud-based NoSQL database for real-time data management.
* **Room Database** – Local database for offline storage of bookmarks and downloaded books.
* **Coroutines** – Asynchronous programming for efficient background tasks.
* **MVVM Architecture** – Ensures clear separation of concerns and maintainable code.
* **PDFView Library** – Provides a smooth e-book reading experience.

## ⚙️ Architecture

The app is structured using the MVVM (Model-View-ViewModel) architecture to ensure separation of concerns and maintainability. The ViewModel handles UI-related data, while the Model interacts with Firebase and Room Database for data fetching and persistence. Coroutines are used for asynchronous tasks, such as downloading books, fetching data from Firebase, and handling UI updates.

## 💡 Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/shubhampandey45/Lumina.git
   ```

2. Open the project in Android Studio.

3. Connect your Firebase project to the app.

4. Build and run the app on your device or emulator.
