package com.nudriin.myunittest

internal class MainViewModel(private val cuboid: CuboidModel) {
    fun getCircumference() = cuboid.getCircumference()
    fun getSurfaceArea() = cuboid.getSurfaceArea()
    fun getVolume() = cuboid.getVolume()
    fun save(w: Double, l: Double, h: Double) {
        cuboid.save(w, l, h)
    }
}