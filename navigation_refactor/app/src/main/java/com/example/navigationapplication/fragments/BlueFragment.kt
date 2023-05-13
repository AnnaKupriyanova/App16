package com.example.navigationapplication.fragments

import androidx.navigation.fragment.findNavController
import com.example.navigationapplication.R

class BlueFragment : BaseFragment(R.layout.blue_fragment) {
    override val buttonId: Int
        get() = R.id.btnNext

    override fun onClick() {
        findNavController().navigate(R.id.blue_red)
    }
}
