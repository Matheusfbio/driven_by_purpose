 package br.com.mfdesenvilvimento.driven_by_purpose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import br.com.mfdesenvilvimento.driven_by_purpose.R
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

 class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)

         supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
     }
}
