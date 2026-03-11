# ds-stack-Christabelle-2086022510020
question 1
1. Cara compile dan run
    - Gunakan terminal 
    - Ketik javac Bracket.java untuk compile jadi class
    - Ketik java Bracket untuk menjalankan program
    - Input bracket sequence
    - Program akan mengeluarkan output

2. Format input dan contohnya
    - Input berupa karakter kurung : () {} []
    - contoh:
        input: {([])}
        output: balanced

3. Asumsi dan egde cases
    Asumsi:
    - Inputnya hanya berupa 3 jenis karakter kurung ( () {} [] ), selain itu akan diabaikan
    Edge Cases:
    - Input kosong, outputnya balanced karena tidak ada kurung yang berpasangan
    - Hanya kurung buka, not balanced karena tidak ada kurung tutup
    - Hanya kurung tutup, not balanced karena tidak ada kurung buka


question 2
1. Cara compile dan run
    - Gunakan terminal 
    - Ketik javac RPN.java untuk compile jadi class
    - Ketik java RPN untuk menjalankan program
    - Input RPN
    - Program akan mengeluarkan output

2. Format input dan contohnya
    - Format input: angka angka operator angka operator dst
    <operand> <operand> <operator>
    - Setiap elemen harus dipisahkan dengan spasi
    - Operator yang didukun hanya + - * /
    - Contoh:
        input: 2 1 + 3 *
        output: 22

3. Asumsi dan egde cases
    Asumsi:
    - Input berupa RPN(Revese Polish Notation)
    - Operand berupa integer positif
    - Operator yang didukun hanya + - * /
    - Jumlah operand cukup untuk setiap operator
    - Hasil perhitungan masih masuk dalam range integer Java
    Edge Cases:
    - Jika hasil angkanya desimal maka akan dibulatkan ke bawah
    - Input hanya 1 angka, maka akan langsung tambah 13
    - Jika terdapat operator dan kurang operandnya, maka program akan error

question 3
1. Cara compile dan run
2. Format input dan contohnya
3. Asumsi dan egde cases

question 4
1. Cara compile dan run
    - Gunakan terminal 
    - Ketik javac SecuritySystem.java untuk compile jadi class
    - Ketik java SecuritySystem untuk menjalankan program
    - Input angka yang akan dipisahkan
    - Setelah input, CTRL + D untuk menandakan end of input
    - Program akan mengeluarkan output

2. Format input dan contohnya
    - Harus input angka dan setiap angka harus dipisahkan dengan spasi
    - contoh:
    input: 45 76 33 8 2 
    CTRL + D
    output: 2 8 33 45 76

3. Asumsi dan egde cases
    Asumsi:
    - Inputnya harus angka
    - Input hanya berisi integer (bil bulat)
    - Angka dipisahkan dengan spasi
    - Program menggunakan Stack(sebagai strukdur data utama) dan Array(sebagai tempat sementara untuk sorting)
    Edge cases:
    - Input kosong, program tidak memberikan output apa-apa karena tidak ada angka untk diproses
    - Hanya 1 angka, program tidak perlu sorting karena hanya memiiki 1 elemen
    - Angka sudah terurut, program tetap berjalan tetapi tidak ada pertukarana di bubbble sort
    - Urutan angka terbalik, program akan tetap berjalan tetapi ini adalah worst case untuk bubble sort
    
    
question 5
1. Cara compile dan run
    - Gunakan terminal
    - Ketik javac Bombs.java untuk compile jadi class
    - Ketik java Bombs untuk menjalankan program
    - Input angka yang akan diproses
    - Program akan mengeluarkan output

2. Format input dan contohnya
    - Input berupa 
3. Asumsi dan egde cases
