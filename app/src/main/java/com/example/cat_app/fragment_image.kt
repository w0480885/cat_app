package com.example.cat_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

/**
 * A simple [Fragment] subclass that displays an image.
 * Use the [ImageFragment.newInstance] factory method to
 * create an instance of this fragment with an image resource.
 */
class ImageFragment : Fragment() {

    // Rename the parameter to reflect the image resource ID
    private var imageResId: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            imageResId = it.getInt(ARG_IMAGE_RES_ID)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_image, container, false)

        // Set the image resource to the ImageView
        imageResId?.let {
            view.findViewById<ImageView>(R.id.imageView).setImageResource(it)
        }

        return view
    }

    companion object {
        // Use a more descriptive name for the argument key
        private const val ARG_IMAGE_RES_ID = "imageResId"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided image resource ID.
         *
         * @param imageResId The resource ID of the image to display.
         * @return A new instance of fragment ImageFragment.
         */
        @JvmStatic
        fun newInstance(imageResId: Int) =
            ImageFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_IMAGE_RES_ID, imageResId)
                }
            }
    }
}
