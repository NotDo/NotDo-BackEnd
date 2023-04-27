import com.gsm.notdo.common.error.BasicException
import com.gsm.notdo.domain.user.exception.error.UserErrorCode

class UserNotFoundException() : BasicException(UserErrorCode.NOT_FOUND)