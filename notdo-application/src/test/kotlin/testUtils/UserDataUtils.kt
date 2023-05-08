package testUtils

import com.gsm.notdo.domain.auth.port.input.dto.SignUpDto

class UserDataUtils {
    private fun email() = listOf("email", "email1" ,"email2").random()
    private fun password() = listOf("password1", "password2", "password3").random()
    private fun nickname() = listOf("이름" , "이름1", "이름2").random()

    fun signUpDto() = SignUpDto(
            email = email(),
            password = password(),
            nickname = nickname()
    )
}