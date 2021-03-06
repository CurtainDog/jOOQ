<?php
require 'frame.php';
function getH1() {
	return 'The history of jOOQ. From 2009 to ' . date('Y');
}
function getActiveMenu() {
	return "download";
}
function printContent() {
    if (isset($_GET['version']) && $_GET['version'] == '2.0') {
	  $contents = file('inc/RELEASENOTES-2.0.txt');
    }
    else if (isset($_GET['version']) && $_GET['version'] == '2.1') {
	  $contents = file('inc/RELEASENOTES-2.1.txt');
    }
    else if (isset($_GET['version']) && $_GET['version'] == '2.2') {
	  $contents = file('inc/RELEASENOTES-2.2.txt');
    }
    else if (isset($_GET['version']) && $_GET['version'] == '2.3') {
	  $contents = file('inc/RELEASENOTES-2.3.txt');
    }
    else if (isset($_GET['version']) && $_GET['version'] == '2.4') {
	  $contents = file('inc/RELEASENOTES-2.4.txt');
    }
    else if (isset($_GET['version']) && $_GET['version'] == '2.5') {
	  $contents = file('inc/RELEASENOTES-2.5.txt');
    }
    else {
      $contents = file('inc/RELEASENOTES.txt');
    }

	for ($i = 0; $i < count($contents); $i++) {
		if ($i + 1 < count($contents) && substr($contents[$i + 1], 0, 3) == '===') {
		    $id = trim(preg_replace('%Version (\d+\.\d+\.\d+).*\n?%', '$1', $contents[$i]));
			print '<h2 id="' . $id . '"><a href="#' . $id . '" name="' . $id . '">#</a> ';
			print $contents[$i];
			print '</h2>';
		}
		else if ($i + 1 < count($contents) && substr($contents[$i + 1], 0, 3) == '---') {
			print '<h3>';
			print $contents[$i];
			print '</h3>';
		}

		else if (substr($contents[$i], 0, 3) == '===') {
			// Skip
		}
		else if (substr($contents[$i], 0, 3) == '---') {
			// Skip
		}
		else if (trim($contents[$i]) == '' && substr($contents[$i + 1], 0, 1) != '-') {
			print '<p>';
		}

		// Create an <ul> from a list of "dashed" elements
		else if (substr($contents[$i], 0, 1) == '-') {
			print '<ul>';

			while (trim($contents[$i]) != '') {
				print '<li>';
				print preg_replace('%-\s+(.*)%', '$1', markup($contents[$i]));

				while (trim($contents[++$i]) != '' && substr($contents[$i], 0, 1) != '-') {
					print markup(htmlentities($contents[$i]));
				}

				print '</li>';
			}

			print '</ul><p>';
		}

		// Create a ticket-table from a list of "hashed" elements
		else if (substr($contents[$i], 0, 1) == '#') {
			print '<table class="ticket-table">';

			while (trim($contents[$i]) != '') {
				$ticket = preg_replace('%#(\d+).*%', '$1', $contents[$i]);

				print '<tr>';
				print '<td width="80">';
				print '<a href="https://github.com/jOOQ/jOOQ/issues/' . $ticket . '">#';
				print $ticket;
				print '</a>';
				print '</td>';
				print '<td>';
				print htmlentities(preg_replace('%#\d+\s+-\s+(.*)%', '$1', $contents[$i]));

				while (trim($contents[++$i]) != '' && substr($contents[$i], 0, 1) != '#') {
					print htmlentities($contents[$i]);
				}

				print '</td>';
				print '</tr>';
			}

			print '</table>';
		}
		else {
		    print markup($contents[$i]);
		}
	}
}

function markup($value) {
	$value = htmlentities($value);
	$value = preg_replace('%&lt;pre&gt;%', '<pre>', $value);
	$value = preg_replace('%&lt;/pre&gt;%', '</pre>', $value);
	$value = preg_replace('%(https?://\S+)%', '<a href="$1">$1</a>', $value);
	return $value;
}
?>