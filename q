                             Table "public.meta_menu"
       Column       |            Type             | Collation | Nullable | Default 
--------------------+-----------------------------+-----------+----------+---------
 id                 | bigint                      |           | not null | 
 archived           | boolean                     |           |          | 
 version            | integer                     |           |          | 
 created_on         | timestamp without time zone |           |          | 
 updated_on         | timestamp without time zone |           |          | 
 condition_to_check | character varying(1024)     |           |          | 
 hidden             | boolean                     |           |          | 
 icon               | character varying(255)      |           |          | 
 icon_background    | character varying(255)      |           |          | 
 left_menu          | boolean                     |           |          | 
 link               | character varying(255)      |           |          | 
 mobile_menu        | boolean                     |           |          | 
 module             | character varying(255)      |           |          | 
 module_to_check    | character varying(255)      |           |          | 
 name               | character varying(255)      |           | not null | 
 order_seq          | integer                     |           |          | 
 priority           | integer                     |           |          | 
 tag                | character varying(255)      |           |          | 
 tag_count          | boolean                     |           |          | 
 tag_get            | character varying(255)      |           |          | 
 tag_style          | character varying(255)      |           |          | 
 title              | character varying(255)      |           | not null | 
 top_menu           | boolean                     |           |          | 
 xml_id             | character varying(255)      |           |          | 
 created_by         | bigint                      |           |          | 
 updated_by         | bigint                      |           |          | 
 action             | bigint                      |           |          | 
 parent             | bigint                      |           |          | 
 user_id            | bigint                      |           |          | 
Indexes:
    "meta_menu_pkey" PRIMARY KEY, btree (id)
    "uk_h5lct5kqlqm80a5ibobkp3u4c" UNIQUE CONSTRAINT, btree (xml_id)
    "meta_menu_action_idx" btree (action)
    "meta_menu_name_idx" btree (name)
    "meta_menu_parent_idx" btree (parent)
    "meta_menu_title_idx" btree (title)
    "meta_menu_user_id_idx" btree (user_id)
Foreign-key constraints:
    "fk_4gatyekht2sdcp83lf2s70s7a" FOREIGN KEY (updated_by) REFERENCES auth_user(id)
    "fk_cn3k58mel1ahm8x8dgjk2vrk2" FOREIGN KEY (action) REFERENCES meta_action(id)
    "fk_faev4fiphmyxhvry4gw3uw1k8" FOREIGN KEY (created_by) REFERENCES auth_user(id)
    "fk_jk6vvh0bx8cx8o1tjacx6dtcn" FOREIGN KEY (parent) REFERENCES meta_menu(id)
    "fk_rlgt9m6dv5bcsomo7ulmj8qge" FOREIGN KEY (user_id) REFERENCES auth_user(id)
Referenced by:
    TABLE "meta_menu_groups" CONSTRAINT "fk_6xbngt33kjc2xxhmqr9ppoc66" FOREIGN KEY (menus) REFERENCES meta_menu(id)
    TABLE "meta_menu" CONSTRAINT "fk_jk6vvh0bx8cx8o1tjacx6dtcn" FOREIGN KEY (parent) REFERENCES meta_menu(id)
    TABLE "meta_json_model" CONSTRAINT "fk_osg3guwx9yrfbjck6nfl94aex" FOREIGN KEY (menu) REFERENCES meta_menu(id)
    TABLE "meta_menu_roles" CONSTRAINT "fk_q58k29a9avu7tkjiicjv8yc7s" FOREIGN KEY (menus) REFERENCES meta_menu(id)
    TABLE "meta_json_model" CONSTRAINT "fk_rcp56wf27jttvvhco0dtty7sl" FOREIGN KEY (menu_parent) REFERENCES meta_menu(id)

