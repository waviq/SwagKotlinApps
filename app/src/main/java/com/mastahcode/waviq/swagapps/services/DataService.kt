package com.mastahcode.waviq.swagapps.services

import com.mastahcode.waviq.swagapps.models.Category
import com.mastahcode.waviq.swagapps.models.Product

/**
 * Created by Waviq on 11/8/17.
 *
 */
object DataService {
    val categories = listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("DIGITAL 2","digitalgoodsimage"),
            Category("DIGITAL 3","digitalgoodsimage"),
            Category("DIGITAL 4","digitalgoodsimage"),
            Category("DIGITAL 5","digitalgoodsimage"),
            Category("DIGITAL 6","digitalgoodsimage")
    )

    val hats = listOf(
            Product("Mastahcode Hat Black","$19","hat1"),
            Product("Mastahcode Shirts","$23","hat2"),
            Product("Mastahcode Bag","$200","hat3"),
            Product("Mastahcode Mic","$230","hat4")
    )

    val hoodies = listOf(
            Product("Mastahcode Hoodies Black","$29","hoodie1"),
            Product("Mastahcode Hoodies Shirts","$33","hoodie2"),
            Product("Mastahcode Hoodies Bag","$240","hoodie3"),
            Product("Mastahcode Hoodies Mic","$250","hoodie4")
    )
    val shirts = listOf(
            Product("Mastahcode Shirts Black","$29","shirt1"),
            Product("Mastahcode Shirts Shirts","$33","shirt2"),
            Product("Mastahcode Shirts Bag","$240","shirt3"),
            Product("Mastahcode Shirts Mic","$250","shirt4")
    )
}