package GeeksForGeeks;

/*Given an array of N strings, find the longest common prefix among all strings present in the array.


        Example 1:

        Input:
        N = 4
        arr[] = {geeksforgeeks, geeks, geek,
        geezer}
        Output: gee
        Explanation: "gee" is the longest common
        prefix in all the given strings.
        Example 2:

        Input:
        N = 2
        arr[] = {hello, world}
        Output: -1
        Explanation: There's no common prefix
        in the given strings.*/
public class LongestCommonPrefixArray {

    static String longestCommonPrefix(String arr[], int n){
        int smallestEleIndex =0;
        for(int i=1;i<n;i++){
            if(arr[i].length() < arr[smallestEleIndex].length()){
                smallestEleIndex = i;
            }
        }


        for(int i=arr[smallestEleIndex].length(); i>0;i--){

            boolean foundall = false;
            for(int j=0;j<n;j++){
                if(j == smallestEleIndex){
                    continue;
                }
                if(arr[j].startsWith(arr[smallestEleIndex].substring(0,i))){
                    foundall = true;
                }
                else{
                    foundall = false;
                    break;
                }
            }
            if(foundall){
                return arr[smallestEleIndex].substring(0,i);
            }

        }
        return "-1";
    }

    public static void main(String[] args) {
        String[] a = new String[]{"neykgrybpitzfunlefmtmbikgpxkqingmmsudqysarrilgtrnhka","tmrklbbtojfadcftaxwtqegyxymeioodcfonirhxaozdsfyseulxysvxsjdazsgbzupilyfnmgqflqzsllplfmjzwobvghzibos","mzbaftfrkhjxuaibmtakibiqjhamvsbjrcjxwrqgybfsbntpjtatwilfrmsmgtvyxextxpbvqgntwiihbkcyunflbzxku","ksbjnyypuqxjjtstcvgevaubmxclhxgtpjcchatdsrpdmhzpefvafpdtpffyenstwuydxrjrkyvxhuonzjpgbsaqa","oesgaodytcretccoblkrzjaosdjstjxkprsphvpazj","tljjovufwfhkxltpeeoowfhnoedpemwzzhipeeuakdljogzvnpljxuwlzzcfnygogodkvxnhdyqrgpmtfycesb","tcsaqsgeaxknsjazmapeghsaoseslfjgibhaupgu","qhgajhojzsq","lswdyoqexzobiovxwrknbspkaduzymhledqctjisiwtqmqpjkbylunxws","vqdcdjhuoadwsntofheuqqwobsdzoysjoynujuoxwtuogpenwjhpbdfdxjelhyuxyjridhfzabqiquvp","dehilmgw","tdqodpxwzdegegiupapmpwpvdajpifhblarorrmquqw","xgvohmayiswouffekphvpzlgsywoquonbjdkxgiiygwuldyysfthghpyfnmvibllmqvmw","uwmsszvqxoytxgcnfhctekwrxlisxgarfolxngqnwqiwwkld","nzzyvrvgbqfjqyoejmtqegouqkqaxwvlvvlsoibrygaqfrwofsgjaxdrhvrfrnsoidhylipmopevidknvswvpb","zzggsvyhfdqdqyseojjksowflqeigfvfgdlzylidoyiewajml","ydkwlvnpdvwaaffne","amiokquisfwebvjntuiglobkodpusvzshkitafbvmzzowibqfmysaacqftmyoosxydqaitvutukpfmfmaeeagj","nefntvgqtljttcppxlansoueoaloguiwypjtkrmdcvxxxonvzpksdeyrfjhndplefvxpojvrg","qgidbjundxtcqanxqrpbxwwwnliieoeuuoaxyukduehkgvkwobylxwhkjpvngbkaqmyoiktcqbp","wztkcrvzqelzwinc","zcalcqvnjydkpcgqwqspnrfuefqnuuxvwzibpdoadtl","wtksmcjzvrtaylpufopenxfecte","orakllexnoyjfulffaznoordnwhprnvffysqjwnyklhrfuwnuvakltnyr","oiklpplhfue","tqhckpzgc","eegpxtqqseacrptfzyzfuuvbzfsyowtsazjzvzpnfrrzhkeikfneakhbsczgyuazujarlseqjxpshvarbpxdaggsifahba","xlkoycuporggaejtfyqkyzqshxsqyuawilkgphvdyemzivsptlzumpmvo","mmbokjzxqrenuctgdbdy","xlrtxihswoglqxvbwstnwjkbcsggw","yvrqoqyvlxmtieqdfpwbcskovmhcsfitaajqsjndgzxodnulcqmhkwxgkgkflsy","ujdnstsbuppyfjljbxsovqwhwgokaoxxxdkswetqwiqbub","xaflxvhftptdqkbnhgzzcdsubdnezqryrwkottvmjrqbbtoizpkduezwjoakfrjypvoiomxzdpcekqolhyocd","aogaznukljfbuvntxqizwuslfzjvdokdfqeedaoqjvufqhypaipwchhjgtekjppohtunvi","hfzmyjnnjxchcjrl","kqevhtkopebkphruigurviasmkwybiqnywifruvgzztqimm","uhiprkkdugbxqtmqrxx","rvrsukiczvuteclvpvaldejwxxmrumamhrebepfd","zwqehlteleippgpnughgivnzcqfrvidxftboeutradhqjyfdgokokzpmqvfndikkdnzhj","akvjcghjjpxvdhxvvpqacvipglchuozvywecconndkljsienxwqbtyqzmvgijhdjfknjaaxfkkoes","urqkukknlwkuhtdkejwtsytrefb","mvpiohsjrewfdgbkbeuhntait","zxcbsoyjwnqqwkvupycqiduemkzmsthtsjukattygmpewkylkcbufxyrjafbtovlzryz","tyufpybbymlap","hpfayfhcyvzmvskwfdwzjlakoazzdqgmfmpgrwissjepbqngtkiexkrmmqnriueqgtwz","gtlpzaspozlajpxtgjhyxzjtdzbyvcrdwduvfm","tlyvwntrwezwdyfwde","dbaugyzavfniaygwxwrouvnqbnyxqexvizqozppuwcdxcltzjmodhdwitwilahhiizxhqobnqgksufudrkjanflgbv","dcbokantqbudrdplxwhanrjqhqbptyjxaknmmafdbbi"};
        System.out.println(longestCommonPrefix(a,49));
    }

}
