@LcwBitirme
    Feature: LC Waikiki

        @EmptyPassword
        Scenario Outline: Empty Password
            Given User is on Home Page
            When accept cookie
            When click "giris yap" button
            When type Email "<email>" and click login
            Then should see "<passErr>" Password False message
            Examples:
                | email                     | passErr                   |
                | burakikinci@lcwaikiki.com | Lütfen şifrenizi giriniz. |

        @EmptyEmail
        Scenario Outline: Empty Email
            Given User is on Home Page
            When accept cookie
            When click "giris yap" button
            When type "<password>" and click login
            Then should see "<emailErr>" Email Empty message
            Examples:
                | password       | emailErr                           |
                | 1234567890     | Lütfen e-posta adresinizi giriniz. |

        @CorrectLogin
        Scenario Outline: Login LCW
            Given User is on Home Page
            When accept cookie
            When click "giris yap" button
            When type Email "<email>", Password "<password>" and click login
            Examples:
                | email                  | password |
                | fehaces107@syswift.com | Yxd3jPGxevw8.Sb|

        @GivenScenario
        Scenario Outline: given by the LCW team
            Given User is on Home Page
            When accept cookie
            When click "giris yap" button
            When type Email "<email>", Password "<password>" and click login
            When click woman category
            When click bluz category
            When write "siyah" for filtering
            When choose size for products
            When choose product of the list
            When add to cart
            When go to the cartpage
            Then should see name of "bluz"
            Then should see size of "bluz"
            Then should see piece of "bluz"
            When click go to payment page
            Then should see delivery method text
            Then should see delivery adress text
            Then should see payment method text
            Examples:
                | email                  | password |
                | fehaces107@syswift.com | Yxd3jPGxevw8.Sb|





































