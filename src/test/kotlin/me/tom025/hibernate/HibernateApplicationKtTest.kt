package me.tom025.hibernate

import org.junit.ClassRule
import org.junit.Rule
import org.junit.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit4.rules.SpringClassRule
import org.springframework.test.context.junit4.rules.SpringMethodRule


@SpringBootTest
@TestPropertySource(
        locations = arrayOf(
                "classpath:dbpassword.properties"
        )
)
class HibernateApplicationKtTest {
    companion object {
        @Suppress("RedundantVisibilityModifier")
        @JvmField
        @ClassRule
        public val classRule = SpringClassRule()
    }

    @Suppress("RedundantVisibilityModifier")
    @JvmField
    @Rule
    public val methodRule = SpringMethodRule()

    @Test
    fun `it can boot`() {
    }
}