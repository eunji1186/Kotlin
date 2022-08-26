package com.example.ankolayoutex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.*
import org.jetbrains.anko.sdk27.coroutines.onSeekBarChangeListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        MainUI().setContentView(this)
    }
}

class MainUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
        verticalLayout{
            val name = editText() { hint = "Name" }

            checkBox{
                text="checkbox"
                
                setOnClickListener{
                    isChecked=true
                }
                setChecked(true)
            }

            val percent=textView() {text = "Seek!" }
            seekBar{
                onSeekBarChangeListener {
                    onProgressChanged{ seekBar, progress, fromUser ->
                        percent.text = progress.toString()
                    }
                }
            }

            button("Say Hello"){
                onClick { toast("Hello, ${name.text}!") }
            }.lparams(width= wrapContent){
                horizontalMargin = dip(5)
                topMargin =dip(10)
            }
        }
    }
}