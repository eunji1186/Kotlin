package com.example.messageuithread

import android.os.Bundle
import android.os.Handler
import android.os.Message
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mHandler: Handler
    lateinit var mThread: Thread
    private val START = 100
    private val COUNT = 101

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar.max = 100

        // 버튼 클릭 처리
        start_progress.setOnClickListener {
            if (!mThread.isAlive) {
                // 카운트 시작 메시지 보내기
                mHandler.sendEmptyMessage(START)
            }
        }

        // 일반 스레드의 생성
        mThread = Thread(Runnable {
            for (i in 0..100) {

                Thread.sleep(100)

                // 메시지의 구성
                val message = Message()
                message.what = COUNT
                message.arg1 = i

                //카운트 값 메시지 보내기
                mHandler.sendMessage(message)
            }
        })
    }

    override fun onResume() {
        super.onResume()

        mHandler = MyHandler(this)

    }

    companion object {
        class MyHandler(private val activity: MainActivity) : Handler() {
            override fun handleMessage(msg: Message) {
                super.handleMessage(msg)
                if (msg.what == activity.START) {
                    // 일반 스레드의 시작
                    if(activity.mThread.state == Thread.State.NEW)
                        activity.mThread.start()

                } else if (msg.what == activity.COUNT) {
                    activity.progressBar.progress = msg.arg1
                    activity.tv_count.text = "Count " + msg.arg1 // UI의 갱신
                }
            }
        }
    }

}