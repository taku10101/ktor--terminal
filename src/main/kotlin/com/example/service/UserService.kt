import java.util.UUID
import com.example.model.User
import com.example.repository.UserRepository
class UserService {
    private val userRepository = UserRepository()

    fun findAll(): List<User> {
        return userRepository.finedAll()
    }

    fun findById(id: UUID): User? {
        return userRepository.finedById(id)
    }

    fun findByUsername(username: String): User? {
        return userRepository.finedByUsername(username)
    }

    fun save(user: User): Boolean {
        return userRepository.save(user)
    }
}