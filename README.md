# UI Basics Android App

This project is a basic Android application that demonstrates a simple user interface interaction.
It includes a `TextView` and a `Button` where clicking the button changes the text displayed in
the `TextView`.

## Table of Contents

- [Overview](#Overview)
- [Installation](#installation)
- [Usage](#usage)
- [Code Structure](#code-structure)
- [License](#License)

## Overview

The project contains a single activity, `MainActivity`, with the following features:

- A `TextView` that displays a welcome message.
- A `Button` that, when clicked, updates the text of the `TextView`.

## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/your-repository/UIBasics.git
    ```
2. Open the project in Android Studio.
3. Build the project to ensure all dependencies are downloaded and set up correctly.

## Usage

1. Launch the app on an emulator or physical device.
2. The main screen will display a welcome message.
3. Click the button below the welcome message to change the text.

## Code Structure

### MainActivity.java

```java
package com.example.uibasics;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHelloButtonClick(View view) {
        TextView welcomeText = findViewById(R.id.txtWelcome);
        welcomeText.setText(R.string.new_greet);
    }
}
```

### activity_main.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools" android:layout_width="match_parent"
    android:layout_height="match_parent" tools:context=".MainActivity">

    <TextView android:id="@+id/txtWelcome" android:layout_width="wrap_content"
        android:layout_height="wrap_content" android:layout_centerInParent="true"
        android:text="@string/greet" android:textColor="#b3d" android:textSize="20sp"
        android:textStyle="bold|italic" />

    <Button android:layout_width="wrap_content" android:layout_height="wrap_content"
        android:layout_below="@+id/txtWelcome" android:layout_centerHorizontal="true"
        android:layout_marginTop="15dp" android:background="@color/teal_700"
        android:onClick="onHelloButtonClick" android:text="@string/btn_Action" />

</RelativeLayout>

```

### strings.xml

```xml

<resources>
    <string name="app_name">UI Basics</string>
    <string name="greet">Welcome!</string>
    <string name="new_greet">Hello, World!</string>
    <string name="btn_Action">Click Me!</string>
</resources>

```

### colors.xml

```xml

<resources>
    <color name="teal_700">#018786</color>
</resources>

```

### License

- This project is licensed under the MIT License. See the [LICENSE](LICENSE.md) file for more
  details.
