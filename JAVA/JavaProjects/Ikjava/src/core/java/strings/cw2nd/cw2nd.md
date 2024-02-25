
<details>
<summary>
what is .indexOf doing here?

if (vow.indexOf(x) != -1) {
this part is equivalent to
if (vow.indexOf(x) == 1) {</summary>>
Actually, the condition `vow.indexOf(x) != -1` is not equivalent to `vow.indexOf(x) == 1`.

In the original code, `vow.indexOf(x) != -1` checks if the character `x` exists in the `vow` string. It returns the index of the character if it is found, and -1 if it is not found. Therefore, `vow.indexOf(x) != -1` evaluates to `true` if `x` is present in the `vow` string, indicating that `x` is a vowel.

On the other hand, `vow.indexOf(x) == 1` checks if the character `x` is found at the index 1 in the `vow` string. This means it is specifically checking if `x` is the second character in the `vow` string, which is not the same as verifying if `x` is a vowel in general.

So, to correctly determine if `x` is a vowel, you would want to use the condition `vow.indexOf(x) != -1`, not `vow.indexOf(x) == 1`.  
</details>