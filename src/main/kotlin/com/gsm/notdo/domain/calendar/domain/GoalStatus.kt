package com.gsm.notdo.domain.calendar.domain

enum class GoalStatus(val description: String) {
    NOT_STARTED("아직은 시작하기 전인"),
    PLANNING("이제 막 계획을 세우게 된"),
    PREPARING("아직은 수행 준비 중"),
    STARTED("계획을 수행하기 시작한"),
    PROGRESS("목표를 이루기 시작한"),
    HABIT("이제는 계획이 습관이 됨"),
    ACHIEVED("목표를 이루는게 익숙한")
}