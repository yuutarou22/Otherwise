# ぺちぱな #14 (2017/6/3)
## 講師
木原　ストライプ　秀明　さん。  
下田さん（ICC卒）

## 目次
- dockerの使い方  
- GitlabをつかったCI環境を構築  
- 自分専用mastodonインスタンスを起動してトゥート  

## 準備
- https://goo.gl/ddfRra
- docker for mac(mac)
- docker toolbox(windows)

## dockerコマンド
- df -h 
- vi ~~~.txt -> i -> input -> wq -> Ctrl + S
- ls ファイルを見る
- pwd == カレントディレクトリの場所
- ls == カレントディレクトリの中身
- cd == 大文字小文字気をつける！


## コンテナと仮想マシンの違い
仮想化==Winの中にLinuxみたいに、色んなOS上で仮想環境で提供することが出来る。検証などに使える  
Winの上に仮想マシンの上に別のOSが乗っかっている  
コンテナ==仮想化の1つでもある。  
アプリケーションの仮想化。  
仮想化なら2重にOSが立っているが、コンテナなら仮想マシンが要らないため、オーバヘッドが少なく済む。  
  
仮想マシン→Win→Linux  
コンテナ→アプリケーション  
※コンテナの上に置くのは基本的にLinuxっていうのが欠点  

## 各種ツールの違い
- Linux ネイティブ最強　dockerはLXCベース
- docker for mac 
> hyperkit
- docker for win
> hyper V ※pro以上じゃないと遣えない
- docker toolbox
> virtualbox

## dockerのいいところ
- リソースに優しい
- 起動が早い
- とにかくシンプル
> docker run ...
> docker-compose up -d

## ドキュメント
- 【ぺちぱなドキュメント】https://www.gitbook.com/book/hideakikihara/phper-na-14/details
- 【Dockerレファレンス】http://docs.docker.jp/windows/toc.html
- 【Dockerイメージの理解とコンテナのライフサイクル】https://www.slideshare.net/zembutsu/docker-images-containers-and-lifecycle
- 【Docker入門: コンテナ型仮想化技術の仕組みと使い方】https://www.slideshare.net/yuichi110/docker-introduction-42455180


## ぺちぱな#15　10月の第3？
