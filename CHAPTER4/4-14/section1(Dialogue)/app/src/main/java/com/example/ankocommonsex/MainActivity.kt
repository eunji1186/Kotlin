package com.example.ankocommonsex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.design.snackbar

class MainActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        info("onCreate() - info message") // 일반 정보
        debug(5) // .toString()이 호출되 문자열로 바뀜
        warn(null) // null로 출력

        btn_toast.setOnClickListener {
            // Anko의 Toasts
            toast("안녕하세요!") // 짧은 길이의 Toast
            toast(R.string.message)  // 리소스의 메시지 직접 사용하기
            longToast("메시지가 긴 길이를 가지고 있을 때 사용")
        }

        btn_snackbar.setOnClickListener {
            // it.longSnackbar("메시지가 긴 길이를 가지고 있을 때 사용")
            it.snackbar("실행할까요?", "실행") {
                // 클릭 이벤트의 처리 내용
                toast("실행합니다!")
            }

        }
        btn_alert.setOnClickListener {
            alert("애완동물이 있나요?") {
                yesButton { toast("좋아요.") }
                noButton { }
            }.show()
        }
        btn_progress.setOnClickListener {
            val dialog = horizontalProgressBar()
            dialog.progress = 50
        }
        btn_sub.setOnClickListener {

            startActivity(intentFor<SubActivity>("id" to 5).singleTop())
        }

    }
}