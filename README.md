# タスク管理

## API

- タスクを登録
 1. リクエストで指定されたタスクをDBに登録する
 
- タスクを削除
- タスクの更新
- タスクの一覧取得
- タスクの全件取得

## DB構成

DB名 : taskmng
テーブル名 : tasklist

| カラム | 型 | 説明 |
| ----- | -- | --- |
| taskid | serial | タスクID |
| title | text | タスクのタイトル |
| created_at | timestamp | タスクの作成時間 |
| updated_at | timestamp | タスクの更新時間 |

