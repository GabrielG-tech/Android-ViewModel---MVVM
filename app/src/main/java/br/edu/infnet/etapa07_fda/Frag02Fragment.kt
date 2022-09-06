package br.edu.infnet.etapa07_fda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import br.edu.infnet.etapa07_fda.databinding.FragmentFrag02Binding

class Frag02Fragment : Fragment() {

    val viewModel: SharedViewModel by activityViewModels()

    private var _binding: FragmentFrag02Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFrag02Binding.inflate(inflater, container, false)
        val view = binding.root
        setup()
        return view
    }

    private fun setup() {
        setupObservers()
    }
    private fun setupObservers() {
        viewModel.contadorFrag02.observe(viewLifecycleOwner){
            binding.contadorFrag02.text = "Contador Frag02: ${it}"
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}