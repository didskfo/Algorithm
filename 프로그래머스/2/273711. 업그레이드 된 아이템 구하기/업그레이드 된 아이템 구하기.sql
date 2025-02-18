-- 코드를 작성해주세요
SELECT i.item_id, i.item_name, i.rarity
from item_info i inner join item_tree t on i.item_id = t.item_id
where t.parent_item_id in (select item_id from item_info where rarity = 'RARE')
order by 1 desc;