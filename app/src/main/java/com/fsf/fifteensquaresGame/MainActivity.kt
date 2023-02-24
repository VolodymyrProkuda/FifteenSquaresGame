package com.fsf.fifteensquaresGame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fsf.fifteensquaresGame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    val pictureOfSquaresNumber = listOf<Int>(R.drawable.game_15_0,
        R.drawable.game_15_1,R.drawable.game_15_2,R.drawable.game_15_3,R.drawable.game_15_4,
        R.drawable.game_15_5,R.drawable.game_15_6,R.drawable.game_15_7,R.drawable.game_15_8,
        R.drawable.game_15_9,R.drawable.game_15_10,R.drawable.game_15_11,R.drawable.game_15_12,
        R.drawable.game_15_13,R.drawable.game_15_14,R.drawable.game_15_15)
    val fifteenSquaresFieldNum = mutableListOf<Int>(12,0,5,4,
    3,6,7,10,
    9,11,14,13,
    15,1,8,2)
    var numberToUse = 0
    var nnn = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showAllNumbersSquares()

        nnn++


        binding.imageView4.setOnClickListener {    tryToChangeNumber(0) }
        binding.imageView3.setOnClickListener {    tryToChangeNumber(1) }
        binding.imageView2.setOnClickListener {    tryToChangeNumber(2) }
        binding.imageView.setOnClickListener {    tryToChangeNumber(3) }
        binding.imageView8.setOnClickListener {    tryToChangeNumber(4) }
        binding.imageView7.setOnClickListener {    tryToChangeNumber(5) }
        binding.imageView6.setOnClickListener {    tryToChangeNumber(6) }
        binding.imageView5.setOnClickListener {    tryToChangeNumber(7) }


        binding.imageView12.setOnClickListener {    tryToChangeNumber(8) }
        binding.imageView11.setOnClickListener {    tryToChangeNumber(9) }
        binding.imageView10.setOnClickListener {    tryToChangeNumber(10) }
        binding.imageView9.setOnClickListener {    tryToChangeNumber(11) }
        binding.imageView16.setOnClickListener {    tryToChangeNumber(12) }
        binding.imageView15.setOnClickListener {    tryToChangeNumber(13) }
        binding.imageView14.setOnClickListener {    tryToChangeNumber(14) }
        binding.imageView13.setOnClickListener {    tryToChangeNumber(15) }


    }
    fun tryToChangeNumber(i:Int) {
        if ((i<15) && (fifteenSquaresFieldNum[i+1] == 0)) {
            numberToUse = fifteenSquaresFieldNum[i+1]
            fifteenSquaresFieldNum[i+1] = fifteenSquaresFieldNum[i]
            fifteenSquaresFieldNum[i] = numberToUse
        }
        if ((i>0) && (fifteenSquaresFieldNum[i-1] == 0)) {
            numberToUse = fifteenSquaresFieldNum[i-1]
            fifteenSquaresFieldNum[i-1] = fifteenSquaresFieldNum[i]
            fifteenSquaresFieldNum[i] = numberToUse
        }
        if (((i+3)<15) && (fifteenSquaresFieldNum[i+4] == 0)) {
            numberToUse = fifteenSquaresFieldNum[i+4]
            fifteenSquaresFieldNum[i+4] = fifteenSquaresFieldNum[i]
            fifteenSquaresFieldNum[i] = numberToUse
        }
        if (((i-3)>0) && (fifteenSquaresFieldNum[i-4] == 0)) {
            numberToUse = fifteenSquaresFieldNum[i-4]
            fifteenSquaresFieldNum[i-4] = fifteenSquaresFieldNum[i]
            fifteenSquaresFieldNum[i] = numberToUse
        }
        showAllNumbersSquares()
    }


    fun showAllNumbersSquares(){
        binding.imageView4.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[0]])
        binding.imageView3.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[1]])
        binding.imageView2.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[2]])
        binding.imageView.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[3]])
        binding.imageView8.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[4]])
        binding.imageView7.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[5]])
        binding.imageView6.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[6]])
        binding.imageView5.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[7]])
        binding.imageView12.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[8]])
        binding.imageView11.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[9]])
        binding.imageView10.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[10]])
        binding.imageView9.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[11]])
        binding.imageView16.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[12]])
        binding.imageView15.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[13]])
        binding.imageView14.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[14]])
        binding.imageView13.setImageResource(pictureOfSquaresNumber[fifteenSquaresFieldNum[15]])


    }
}