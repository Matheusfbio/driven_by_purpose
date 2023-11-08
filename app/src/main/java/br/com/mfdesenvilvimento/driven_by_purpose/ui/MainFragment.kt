package br.com.mfdesenvilvimento.driven_by_purpose.ui

import android.os.Bundle
import android.view.View
import br.com.mfdesenvilvimento.driven_by_purpose.R
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.FragmentMainBinding
import br.com.mfdesenvilvimento.driven_by_purpose.util.navTo

class MainFragment : androidx.fragment.app.Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        binding.codelabToastSnake.setOnClickListener { navTo(R.id.mainFragment) }
        binding.codelabToastSnake.setOnClickListener { navTo(R.id.blankFragment) }
//        binding.codelabNotification.setOnClickListener { navTo(R.id.notificationFragment) }
//        binding.codelabWorkManager.setOnClickListener { navTo(R.id.selectImageFragment) }
//        binding.codelabMaterialComponents.setOnClickListener { navTo(R.id.materialComponentsFragment) }
//        binding.codelabInteractiveUi.setOnClickListener { navTo(R.id.interactiveUiFragment) }
//        binding.codelabActivitiesIntents.setOnClickListener { navTo(R.id.sendFragment) }
//        binding.codelabRecyclerviewWithPaging.setOnClickListener{ navTo(R.id.recyclerViewPagingFragment) }
//        binding.codelabAppSettings.setOnClickListener{ navTo(R.id.appSettingsFragment) }
//        binding.codelabRecyclerview.setOnClickListener { navTo(R.id.recyclerViewFragment) }
//        binding.codelabAccessibility.setOnClickListener { navTo(R.id.accessibilityFragment) }
//        binding.codelabCreateCustomView.setOnClickListener { navTo(R.id.customViewFragment) }
//        binding.codelabUserNavigationTab.setOnClickListener { navTo(R.id.tabHostFragment) }
//        binding.codelabUserNavigationDrawer.setOnClickListener { navTo(R.id.drawerFragment) }
//        binding.codelabMenuPickers.setOnClickListener { navTo(R.id.menuFragment) }
//        binding.codelabThemesTouches.setOnClickListener { navTo(R.id.themeFragment) }
//        binding.codelabThemesTouchesBaterry.setOnClickListener { navTo(R.id.batteryFragment) }
//        binding.codelabRoomWithView.setOnClickListener { navTo(R.id.wordFragment) }
//        binding.codelabCustomTheme.setOnClickListener { toast(getString(R.string.duplicated_dynamic, "Day / Night")) }
//        binding.codelabDrawableStyleThemes.setOnClickListener { toast(getString(R.string.duplicated_dynamic, "Day / Night")) }
//        binding.codelabRoomLivedataViewmodel.setOnClickListener { toast(getString(R.string.duplicated)) }
//        binding.codelabRepository.setOnClickListener { toast(getString(R.string.duplicated)) }
//        binding.codelabSharedPreferences.setOnClickListener { navTo(R.id.sharedPrefFragment) }
//        binding.codelabAnimPulseExplode.setOnClickListener { navTo(R.id.pulseExplodeFragment) }
//        binding.codelabViewmodelViewmodelfactory.setOnClickListener { navTo(R.id.titleFragment) }
//
//        binding.codelabAndroidStudioDebugger.setOnClickListener { navTo(R.id.calcFragment) }
//
//        binding.codelabAddLogStatements.setOnClickListener { toast(getString(R.string.duplicated_dynamic, "Debugger")) }
//        // +-----------------------------------------------------------------+
//        // | Codelab: Navegação entre activities (no fragments for show case) |
//        // +-----------------------------------------------------------------+
//        binding.codelabUserNavigation.setOnClickListener { navTo(R.id.showTabsActivity) }
//        // +-----------------------------------------------------------------+
//        // | Espresso Cheat Sheet (spike muito bom para quando for testar)   |
//        // +-----------------------------------------------------------------+
//        // https://android.github.io/android-test/downloads/espresso-cheat-sheet-2.1.0.pdf
//        // Melhores práticas de teste >> https://developer.android.com/training/testing
//        binding.codelabUnitTests.setOnClickListener { toast("Veja >> Video no Youtube") }
//        binding.codelabTestingJunitMockito.setOnClickListener { toast("Veja >> Video no Youtube") }
//        binding.codelabEspressoUiTesting.setOnClickListener { toast("Veja >> Video no Youtube") }
    }
}