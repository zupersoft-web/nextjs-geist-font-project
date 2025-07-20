package com.mappingdriver.navigation

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.mappingdriver.navigation.databinding.ActivityMainBinding
import com.mappingdriver.navigation.ui.map.MapsActivity

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    
    companion object {
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1001
        private val REQUIRED_PERMISSIONS = arrayOf(
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_BACKGROUND_LOCATION
        )
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setupUI()
        checkPermissions()
    }
    
    private fun setupUI() {
        binding.apply {
            btnStartMapping.setOnClickListener {
                if (hasLocationPermissions()) {
                    startMappingActivity()
                } else {
                    requestLocationPermissions()
                }
            }
            
            btnViewRoutes.setOnClickListener {
                // TODO: Navigate to routes list activity
                Toast.makeText(this@MainActivity, "Routes feature coming soon", Toast.LENGTH_SHORT).show()
            }
            
            btnSettings.setOnClickListener {
                // TODO: Navigate to settings activity
                Toast.makeText(this@MainActivity, "Settings feature coming soon", Toast.LENGTH_SHORT).show()
            }
        }
    }
    
    private fun checkPermissions() {
        if (!hasLocationPermissions()) {
            requestLocationPermissions()
        }
    }
    
    private fun hasLocationPermissions(): Boolean {
        return REQUIRED_PERMISSIONS.all { permission ->
            ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED
        }
    }
    
    private fun requestLocationPermissions() {
        ActivityCompat.requestPermissions(
            this,
            REQUIRED_PERMISSIONS,
            LOCATION_PERMISSION_REQUEST_CODE
        )
    }
    
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        
        when (requestCode) {
            LOCATION_PERMISSION_REQUEST_CODE -> {
                if (grantResults.isNotEmpty() && grantResults.all { it == PackageManager.PERMISSION_GRANTED }) {
                    Toast.makeText(this, "Location permissions granted", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Location permissions are required for this app", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
    
    private fun startMappingActivity() {
        val intent = Intent(this, MapsActivity::class.java)
        startActivity(intent)
    }
}
