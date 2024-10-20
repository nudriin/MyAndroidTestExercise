package com.nudriin.myunittest

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test
import org.mockito.Mockito.mock

class MainViewModelTest {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var cuboidModel: CuboidModel

    private val length = 10.0
    private val width = 10.0
    private val height = 10.0

    private val volume = 1000.0
    private val circumference = 120.0
    private val surfaceArea = 600.0


//    Create setup function
    @Before
    fun before() {
        // mocking with mockito
        cuboidModel = mock(CuboidModel::class.java)
        mainViewModel = MainViewModel(cuboidModel)
    }

    @Test
    fun getCircumference() {
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(width, length, height)
        val circumference = mainViewModel.getCircumference()
        assertEquals(this.circumference, circumference, 0.0001)
    }

    @Test
    fun getSurfaceArea() {
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(width, length, height)
        val surfaceArea = mainViewModel.getSurfaceArea()
        assertEquals(this.surfaceArea, surfaceArea, 0.0001)
    }

    @Test
    fun getVolume() {
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(width, length, height)
        val volume = mainViewModel.getVolume()
        assertEquals(this.volume, volume, 0.0001)
    }

    @Test
    fun save() {
    }
}