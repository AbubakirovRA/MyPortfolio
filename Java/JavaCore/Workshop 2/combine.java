/**
Даны два целых числа: n и k, верните все возможные комбинации числа k из диапазона [1, n].
Вы можете вернуть ответ в любом порядке.
Пример 1:
Вход: n = 4, k = 2
Вывод:
[
 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],
]
 */
// public class combine {
//     List<Integer> path = new ArrayList();
//     List<List<Integer>> ans = new ArrayList();
    
//     public List<List<Integer>> combine(int n, int k) {
//         comb(n, k, 0, 1);
//         return ans;
//         void comb(int n, int k, int index, int number){
//             if (index == k){
//                 ans.add(new ArrayList<>(path));
//                 return;
//             }
//             if (number > n){
//                 return;
//             }
//             for (int i = number; i <= n; i++){
//                 path.add(i);
//                 comb(n, k, index + 1, i + 1);
//                 path.remove(path.size() - 1);
//             }
//     }
//     }

//     private void comb(int n, int k, int i, int j) {
//     }
// }