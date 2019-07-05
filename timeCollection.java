package main;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class timeCollection{
	
	public static ItemStack MinelandItemPortalDevice() {
		ItemStack thing = new ItemStack(Material.FLINT_AND_STEEL, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§aПортальное устройство ''Альфа''");
		thingMeta.setLore(Arrays.asList(
				"§7Высокие Технологии",
				"§2Век АСЗТ", 
				"", 
				"§9Временная Аномалия",
				"§8#1 из 30",
				"",
				"§3Вы: О, какая-то пушка. Возьму себе.",
				"§3АСЗТ: Зафиксирована инородная форма жизни.",
				"§3просьба положить портальное устройство,",
				"§3иначе устройство испепелит вас.",
				"§3Вы: Что? Зачем? Почему? Кто вы?",
				"§3АСЗТ: Включаю шок... Что?",
				"§3Вы: А почему от меня не остался уголёк?",
				"§3АСЗТ: Видимо, портальное устройство теперь",
				"§3принадлежит вам. Поздравляю.",
				"§3Вы: А вы так со всем новыми владельцами?",
				"§3АСЗТ: Это секретная информация."));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItemCodecs() {
		ItemStack thing = new ItemStack(Material.BOOK, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§aКодекс Времени");
		thingMeta.setLore(Arrays.asList(
				"§7Толщина X",
				"§2Век АСЗТ", 
				"", 
				"§9Временная Аномалия",
				"§8#2 из 30",
				"",
				"§3АСЗТ: Раз вы - новый владелец устройства,",
				"§3то я вам должна выдать эту книгу. В ней",
				"§3описаны все правила пользования устройством",
				"§3и советы по устранению циклов.",
				"§3Вы: А что такое цикл?",
				"§3АСЗТ: Скоро ты сам все узнаешь."));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItemCore() {
		ItemStack thing = new ItemStack(Material.FLINT, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§aЯдро АСЗТ");
		thingMeta.setLore(Arrays.asList(
				"§7Высокие Технологии",
				"§2Век АСЗТ", 
				"", 
				"§9Временная Аномалия",
				"§8#3 из 30",
				"",
				"§3Вы: АСЗТ, все-таки, что значит этот",
				"§3набор букв, к которому не подобрать",
				"§3расшифровку?",
				"§3АСЗТ: Я - Автоматическая Система",
				"§3Защиты Трансмодулей. Иными словами,",
				"§3если ты не перенесешься в эпоху или",
				"§3перенесешься частично, то я смогу",
				"§3предотвратить поломку устройства.",
				"§3Вы: Спасибо, от ваших слов мне стало",
				"§3легче."));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItemMedievalSword() {
		ItemStack thing = new ItemStack(Material.FLINT, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§aМеч Крестоносца");
		thingMeta.setLore(Arrays.asList(
				"§7Верность III",
				"§2Средневековье", 
				"", 
				"§9Временная Аномалия",
				"§8#4 из 30",
				"",
				"§3Вы: Что? Как я оказался в Каменном Веке?",
				"§3АСЗТ: Я тебя переместила, зная, что ты не",
				"§3читал книгу, которую я тебе дала.",
				"§3Вы: Ладно, хорошо. Но, пожалуйста, не",
				"§3перемещай меня сама. Что нам надо найти?",
				"§3АСЗТ: Что-то острое и металическое.",
				"§3Вы: Как меч? Если так, то я его вижу.",
				"§3АСЗТ: Именно. Бери его и помещай в специальный",
				"§3отсек на портальном устройстве.",
				"§3Вы: И как же мне положить его в маленький отсек?",
				"§3АСЗТ: Там установлен Чернодыровой Поглотитель."));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItemPrimalAxe() {
		ItemStack thing = new ItemStack(Material.STONE_AXE, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§eПервичный Топор");
		thingMeta.setLore(Arrays.asList(
				"§7Простота X",
				"§2Каменный Век", 
				"", 
				"§9Временная Аномалия",
				"§8#5 из 30",
				"",
				"§3Вы: О, это же моя эпоха. Можно я схожу домой?",
				"§3АСЗТ: Нет. Мы все равно переместились во времени,",
				"§3а значит тебя НИКТО не должен видеть, даже если",
				"§3это твой знакомый. Так гласит кодекс.",
				"§3Вы: Ладно, давай найдем то, что ищем и я пойду",
				"§3дальше ничего не делать.",
				"§3АСЗТ: Эта вещь принадлежит Каменному Веку. Больше",
				"§3ничего не известно. Это трудное задание.",
				"§3Вы: О, топор. Это то?",
				"§3АСЗТ: Да. Теперь быстрее бери его, иначе обитатели",
				"§3данной эпохи заберут его себе и выставят в музей."));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItemGreekColumn() {
		ItemStack thing = new ItemStack(Material.QUARTZ_BLOCK, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§eМраморная Колонна");
		thingMeta.setLore(Arrays.asList(
				"§7Красота V",
				"§2Античность", 
				"", 
				"§9Временная Аномалия",
				"§8#6 из 30",
				"",
				"§3Вы: Мы в Античности, что нам надо найти?",
				"§3АСЗТ: Античную колонну",
				"§3Вы: Но смысл? Она же из этого времени.",
				"§3АСЗТ: Мы должны устранять все. Даже, если вещь",
				"§3из той же эпохи, в которую переместилась. Существует",
				"§3ошибка у циклов, которая перемещает не во времени, а",
				"§3в пространстве, что облегчает возврат педмета.",
				"§3Вы: Как я понял, мы должны его вернуть?",
				"§3АСЗТ: Именно так, мы должны его вернуть. Сейчас",
				"§3высчитаю место, откуда оно могло телепортироваться"));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItemNukelarBomb() {
		ItemStack thing = new ItemStack(Material.TNT, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§eАтомная Бомба");
		thingMeta.setLore(Arrays.asList(
				"§7Опасность XXX",
				"§7Взрыв XXX",
				"§2Ядерный Век", 
				"", 
				"§9Временная Аномалия",
				"§8#7 из 30",
				"",
				"§3Вы: Как говорил Альберт Эйнштейн: Я не зн...",
				"§3АСЗТ: Я знаю эту цитату. У меня их в базе данным много.",
				"§3АСЗТ: Лучше придумай способ как её переместить в отсек",
				"§3попутно не превратившись в уголёк.",
				"§3Вы: Но ты же у нас сверхкомпьютер.",
				"§3АСЗТ: Если бы я все умела, то Агенство не было бы созванно.",
				"§3Вы: Значит, вас нужен я?",
				"§3АСЗТ: Не совсем. Ты узнаешь позже о своем предназначении."));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItemTzarCrown() {
		ItemStack thing = new ItemStack(Material.GOLD_HELMET, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§eЦарская Корона");
		thingMeta.setLore(Arrays.asList(
				"§7Величие V",
				"§2Средневековье", 
				"", 
				"§9Временная Аномалия",
				"§8#8 из 30",
				"",
				"§3АСЗТ: Какое расточительное использование золота!",
				"§3Вместо ненужной короны модно было бы произвести",
				"§3много компьютерных запчастей!",
				"§3Вы: Но они даже не значи что это такое. У них даже",
				"§3простейший мушкет считался орудием Дьявола.",
				"§3АСЗТ: Я, если что, в курсе.",
				"§3Вы: А зачем тогда это говорить?",
				"§3АСЗТ: Ну нужно же мне как-то начать диалог!"));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItemPocketChronometer() {
		ItemStack thing = new ItemStack(Material.WATCH, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§eКарманный Хронометр");
		thingMeta.setLore(Arrays.asList(
				"§7Точность X",
				"§2Эпоха Открытий", 
				"", 
				"§9Временная Аномалия",
				"§8#9 из 30",
				"",
				"§3Вы: Какая тонкая работа! Какой материал! Мне даже",
				"§3жалко это забирать.",
				"§3АСЗТ: Но этой вещи не место в Юрсом Периоде!",
				"§3Вы: Можно я оставлю их себе?",
				"§3АСЗТ: Нет! Мы должны их вернуть!",
				"§3Вы: Но тогда как я вернусь без сувенира?",
				"§3АСЗТ: Ты что, постоянно тащил домой вещи из других эпох!?",
				"§3Вы: Ну да, а что такого?"));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItemExitFromExitlessSituationsButton() {
		ItemStack thing = new ItemStack(Material.WOOD_BUTTON, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§dКнопка Выхода из Безвыходных Cитуаций");
		thingMeta.setLore(Arrays.asList(
				"§7Верность X",
				"§2Век АСЗТ", 
				"", 
				"§9Временная Аномалия",
				"§8#10 из 30",
				"",
				"§cАСЗТ: КРИТИЧЕСКИЙ СБОЙ! СРОЧНО НАЖМИТЕ КНОПКУ",
				"§cВЫХОДА ИЗ БЕЗВЫХОДНЫХ СИТУАЦИЙ, ИНАЧЕ ПОРТАЛЬНОЕ",
				"§cУСТРОЙСТВО ОТПРАВИТСЯ В ДРУГУЮ ЭПОХУ БЕЗ ВАС!",
				"§3Вы: Что? Где? Она?!",
				"§3АСЗТ: Видел бы ты свое лицо.",
				"§3Вы: Это не смешно, но все же. Где эта кнопка?",
				"§3АСЗТ: Я и сама не знаю. Я это придумала сама."));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItemGolemMask() {
		ItemStack thing = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§dМаска Голема");
		thingMeta.setLore(Arrays.asList(
				"§7Камень X",
				"§2Средневековье", 
				"", 
				"§9Временная Аномалия",
				"§8#31 из 30",
				"",
				"§3АСЗТ: Предоставляю информацию о *Маска Голема*",
				"§3Приятный Женский Голос: Маска Голема - предмет",
				"§3экипировки любого голема. Именно посредством",
				"§3этой маски и осуществляется контроль над големом.",
				"§3Вы: А ты можешь так же поменять голос?",
				"§3АСЗТ: А тебе что-то не нравиться? Я могу ударить током.",
				"§3Вы: Нет-нет, все нормально."));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItemGolemBody() {
		ItemStack thing = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§dЯдро Механизма");
		thingMeta.setLore(Arrays.asList(
				"§7Сложные Технологии",
				"§2Информационный Век", 
				"", 
				"§9Временная Аномалия",
				"§8#32 из 30",
				"",
				"§3АСЗТ: Вот то, что нам и нужно.",
				"§3Вы: И как мне это снять?",
				"§3АСЗТ: Победить голема, как же еще?",
				"§3Вы: Я на такое не подписывался!",
				"§3АСЗТ: Ну ладно, найду другого владельца,",
				"§3а тебя нейтрализую, потому что ты знаешь",
				"§3слишком много для обитателя 21 века.",
				"§3Вы: Хорошо, я попытаюсь его убить."));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItemGolemLegs() {
		ItemStack thing = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§dМетеоритовые Поножи");
		thingMeta.setLore(Arrays.asList(
				"§7Скорость X",
				"§2Средневековье", 
				"", 
				"§9Временная Аномалия",
				"§8#33 из 30",
				"",
				"§3АСЗТ: Предоставляю информацию о *Метеоритовые Поножи*",
				"§3Приятный Женский Голос: Метеоритовые поножи -",
				"§3элемент экипировки голема, который дает ему",
				"§3скорость для сокращения расстояния с врагом.",
				"§3Вы: Можно поставить на повтор?",
				"§3АСЗТ: Одного раза более чем достаточно."));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItemGolemBoots() {
		ItemStack thing = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§dБотинки Пушинки");
		thingMeta.setLore(Arrays.asList(
				"§7Легкость III",
				"§7Уклонение II",
				"§2Средневековье", 
				"", 
				"§9Временная Аномалия",
				"§8#34 из 30",
				"",
				"§3АСЗТ: Можно на этот раз я не буду предоставлять",
				"§3информацию о данном предмете?",
				"§3Вы: Нет, это твоя работа. Информировать работников.",
				"§3АСЗТ: Ладно, хорошо.",
				"§3АСЗТ: Предоставляю информацию о *Ботинки Пушинки*",
				"§3Приятный Женский Голос: Ботинки Пушинки - один из",
				"§3элементов экипировки Големов. Как правило, их",
				"§3зачаровывают на мобильность и уклонение, чтобы",
				"§3голем имел превосходство над противником.",
				"§3Вы: Лучше я промолчу по поводу повтора.",
				"§3АСЗТ: И правильно делаешь."));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItemGolemSword() {
		ItemStack thing = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§dМеч Разрушений");
		thingMeta.setLore(Arrays.asList(
				"§2Средневековье", 
				"", 
				"§9Временная Аномалия",
				"§8#35 из 30",
				"",
				"§3АСЗТ: Лучше я сама расскажу об этом мече.",
				"§3Вы: Нет, включай тот приятный голос.",
				"§3АСЗТ: Хорошо.",
				"§3Вы: Так бы сразу.",
				"§3АСЗТ: Предоставляю информацию о *Меч Разрушений*",
				"§3Голос АСЗТ: Меч Разрушений - главное атакующее",
				"§3оружие големов. Оно изготавливается из десяти",
				"§3слоев стали, что делает его более тяжелым и",
				"§3смертельным, чем другие мечи.",
				"§3Вы: Я же просил голос, как в предыдущих записях.",
				"§3АСЗТ: Вы не указали этого, поэтому озвучила все я."));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItemGolem() {
		ItemStack thing = new ItemStack(Material.MONSTER_EGG, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§4§lБОСС: ГОЛЕМ-СТРАЖ");
		thingMeta.setLore(Arrays.asList(
				"§cВызов",
				"§2Средневековье", 
				"", 
				"§9Временная Аномалия",
				"§8#11 из 30",
				"",
				"§3Вы: А что тут не так?",
				"§3АСЗТ: То, что мы ищем носит Голем.",
				"§3Вы: Какой Голем?",
				"§3Голем-Стражник: §cГОТОВЬТЕСЬ К СМЕРТИ, БУКАШКИ!",
				"",
				"§4ВНИМАНИЕ! Данное ЯП вызовет ОЧЕНЬ сложного монстра.",
				"§4Тщательно подготовьтесь, прежде, чем его убивать!",
				"",
				"Статистика:",
				"§4Иммунитет Босса: Падение, Лава, Вода",
				"§4ХП Босса: 100 Единиц(50 Сердечек)",
				"§4АТК Босса: 10 Единиц(5 Сердечек)"));
		thing.setItemMeta(thingMeta);
		return thing;
	}
	
	public static ItemStack MinelandItem() {
		ItemStack thing = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta thingMeta = thing.getItemMeta();
		thingMeta.setDisplayName("§dМеч Разрушений");
		thingMeta.setLore(Arrays.asList(
				"§2Средневековье", 
				"", 
				"§9Временная Аномалия",
				"§8#12 из 30",
				"",
				"§3АСЗТ: Лучше я сама расскажу об этом мече.",
				"§3Вы: Нет, включай тот приятный голос.",
				"§3АСЗТ: Хорошо.",
				"§3Вы: Так бы сразу.",
				"§3АСЗТ: Предоставляю информацию о *Меч Разрушений*",
				"§3Голос АСЗТ: Меч Разрушений - главное атакующее",
				"§3оружие големов. Оно изготавливается из десяти",
				"§3слоев стали, что делает его более тяжелым и",
				"§3смертельным, чем другие мечи.",
				"§3Вы: Я же просил голос, как в предыдущих записях.",
				"§3АСЗТ: Вы не указали этого, поэтому озвучила все я."));
		thing.setItemMeta(thingMeta);
		return thing;
	}

}
